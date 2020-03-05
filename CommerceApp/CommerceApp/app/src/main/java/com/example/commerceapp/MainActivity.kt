package com.example.commerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btSub.setOnClickListener{view : View? ->
            try{
                var intent = Intent(this,WebView::class.java)
                intent.putExtra("url","https://www.submarinoviagens.com.br/")
                startActivity(intent)
            }catch (e: Exception) {
            }
        }

        btMagalu.setOnClickListener{view : View? ->
            try{
                var intent = Intent(this,WebView::class.java)
                intent.putExtra("url","https://www.magazineluiza.com.br/")
                startActivity(intent)
            }catch (e: Exception) {
            }
        }

        btAmerica.setOnClickListener{view : View? ->
            try{
                var intent = Intent(this,WebView::class.java)
                intent.putExtra("url","https://www.americanas.com.br/")
                startActivity(intent)
            }catch (e: Exception) {
            }
        }

        btSob.setOnClickListener{view : View? ->
            try{
                var intent = Intent(this,SobrePage::class.java)
                startActivity(intent)
            }catch (e: Exception) {
            }
        }



    }
}
