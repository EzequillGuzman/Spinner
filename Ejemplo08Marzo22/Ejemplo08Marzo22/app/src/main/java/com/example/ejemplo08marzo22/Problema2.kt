package com.example.ejemplo08marzo22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)


        val etNumero = findViewById<EditText>(R.id.ejem1_et_numero)
        val btnEjemplo1 = findViewById<Button>(R.id.ejem1_btn_ejemplo1)
        val spEjemplo1 = findViewById<Spinner>(R.id.ejem1_sp_ejemplo1)

        btnEjemplo1.setOnClickListener {
            var numero = etNumero.text.toString().toInt();
            val lista = mutableListOf("Los Numeros Generados");
            for (i in 1..numero){
                if(i % 3 == 0){

                    lista.add("$i")
                    }

            }
            val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
            spEjemplo1.adapter = adaptador

        }


    }
}