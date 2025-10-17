package com.example.cursoaristidevs.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.cursoaristidevs.R


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        //pone string vacio si es nulo
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text="Hola $name"

    }
}