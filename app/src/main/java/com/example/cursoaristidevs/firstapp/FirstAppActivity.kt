package com.example.cursoaristidevs.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.cursoaristidevs.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app) //parte visual
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart) //enlasa el boton
        val etName = findViewById<AppCompatEditText>(R.id.etName)


        btnStart.setOnClickListener {
            val name = etName.text.toString()
            if (name.isNotEmpty()) {
               // Log.i("Aristides","Button Pulsado ${name}")
                val intent = Intent(this,ResultActivity::class.java )
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }

        //al arrancar la pantalla es el metodo main

    }
}