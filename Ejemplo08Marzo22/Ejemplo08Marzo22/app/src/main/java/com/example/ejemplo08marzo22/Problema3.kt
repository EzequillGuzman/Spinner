package com.example.ejemplo08marzo22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class Problema3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3)


        val etNumero = findViewById<EditText>(R.id.numeroinincial)
        val etNumero2 = findViewById<EditText>(R.id.numerofinal)
        val btnEjemplo1 = findViewById<Button>(R.id.ejem1_btn_ejemplo1)
        val spEjemplo1 = findViewById<Spinner>(R.id.ejem1_sp_ejemplo1)

        btnEjemplo1.setOnClickListener {
            var numero = etNumero.text.toString().toInt();
            var numero2 = etNumero2.text.toString().toInt()
            val lista = mutableListOf("Los Numeros Generados");
            for (i in numero..numero2 step(5)) lista.add("$i")
            val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
            spEjemplo1.adapter = adaptador

        }
    }



    }
