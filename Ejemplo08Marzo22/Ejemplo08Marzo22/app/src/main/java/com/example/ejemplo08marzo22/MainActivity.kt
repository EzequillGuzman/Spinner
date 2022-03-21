package com.example.ejemplo08marzo22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEjemplo1 = findViewById<Button>(R.id.main_btn_ejemplo1)
        val btnEjemplo2 = findViewById<Button>(R.id.main_btn_ejemplo2)
        val btnProblema1 = findViewById<Button>(R.id.main_btn_problema1)
        val btnProblema2 = findViewById<Button>(R.id.main_btn_problema2)
        val btnProblema3 = findViewById<Button>(R.id.main_btn_problema3)
        val btnProblema4 = findViewById<Button>(R.id.main_btn_problema4)
        val btnProblema5 = findViewById<Button>(R.id.main_btn_problema5)
        val btnProblema6 = findViewById<Button>(R.id.main_btn_problema6)

        btnEjemplo1.setOnClickListener {
            //llamar a Ejemplo1Activity
            val intentEjemplo1:Intent = Intent(this,Ejemplo1Activity::class.java)
            startActivity(intentEjemplo1)

        }

        btnEjemplo2.setOnClickListener {
            val intentEjemplo2 : Intent = Intent(this,Ejemplo2Activity::class.java)
            startActivity(intentEjemplo2)
        }

        btnProblema1.setOnClickListener {
            val intentProblema1 : Intent = Intent(this,Problema1::class.java)
            startActivity(intentProblema1)
        }
        btnProblema2.setOnClickListener {
            val intentProblema2 : Intent = Intent(this,Problema2::class.java)
            startActivity(intentProblema2)
        }


        btnProblema3.setOnClickListener {
            val intentProblema3 : Intent = Intent(this,Problema3::class.java)
            startActivity(intentProblema3)
        }


        btnProblema4.setOnClickListener {
            val intentProblema4 : Intent = Intent(this,Problema4::class.java)
            startActivity(intentProblema4)
        }

        btnProblema5.setOnClickListener {
            val intentProblema5 : Intent = Intent(this,Problema5::class.java)
            startActivity(intentProblema5)
        }

        btnProblema6.setOnClickListener {
            val intentProblema6 : Intent = Intent(this,Problema6::class.java)
            startActivity(intentProblema6)
        }


    }
}