package com.enrique.enrique_eq1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initEvents()
    }
     private fun initEvents(){
        val button=findViewById<Button>(R.id.btn1)
        button.setOnClickListener{
            val intent = Intent(this,TerceraActivity::class.java)
            startActivity(intent)


            val button=findViewById<Button>(R.id.btn3)
            button.setOnClickListener{
                val intent = Intent(this,TerceraActivity::class.java)
                startActivity(intent)
         }
        }
     }
}