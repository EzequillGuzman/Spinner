package com.example.ejemplo08marzo22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class Ejemplo2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo2)



        val etNumero = findViewById<EditText>(R.id.ejem2_et_numero)
        val btnEjemplo2 = findViewById<Button>(R.id.ejem2_btn_ejemplo1)
        val spEjemplo2 = findViewById<Spinner>(R.id.ejem2_sp_ejemplo1)

        btnEjemplo2.setOnClickListener {
            var numero = etNumero.text.toString().toInt();
            val lista = mutableListOf("Numeros Generados");
            for (i in 1..10){
                 lista.add("$numero X $i = " + numero * i)

            }
            val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
            spEjemplo2.adapter = adaptador

        }
    }
}