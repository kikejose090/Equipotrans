package com.enrique.enrique_eq1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TerceraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)

        initEvents()
    }
    private fun initEvents(){
        val button=findViewById<Button>(R.id.btn2)
        button.setOnClickListener{
            val intent = Intent(this,CuatroActivity::class.java)
            startActivity(intent)

        }
    }

    }

