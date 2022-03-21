package com.example.ejemplo08marzo22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class Ejemplo1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo1)


        val etNumero = findViewById<EditText>(R.id.ejem1_et_numero)
        val btnEjemplo1 = findViewById<Button>(R.id.ejem1_btn_ejemplo1)
        val spEjemplo1 = findViewById<Spinner>(R.id.ejem1_sp_ejemplo1)

        btnEjemplo1.setOnClickListener {
            var numero = etNumero.text.toString().toInt();
            val lista = mutableListOf("Numeros Generados");
            for (i in 1..numero){
                lista.add("$i")

            }
            val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
            spEjemplo1.adapter = adaptador

        }



        /*
        //asignar elementos a un SPINNER en tiempo de ejecución
        //1) Lista
        //2) Asignar la lista por medio de un adaptador

        //1)lista
        //lista inmutable = no puede cambiar en tiempo de ejecución, los elementos son fijos
        val lista = listOf("uno","dos","tres")

        //lista mutable = puede cambiar en tiempo de ejecución (agregar, modificar o eliminar elementos)
        val lista2 = mutableListOf("uno","dos","tres")

        for(i in 1..10){
            lista2.add("Elemento$i")
        }
        lista2.add("cuatro")

        //2) adaptador
        //adaptador para el spinner
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item,lista2)
        spEjemplo1.adapter = adaptador

         */


    }
}