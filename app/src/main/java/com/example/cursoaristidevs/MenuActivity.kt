package com.example.cursoaristidevs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cursoaristidevs.firstapp.FirstAppActivity
import com.example.cursoaristidevs.imccalculator.ImcCalculatorActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludarApp = findViewById<Button>(R.id.btnSaludarApp)
        btnSaludarApp.setOnClickListener { navigateToSaludarApp()}

        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        btnIMCApp.setOnClickListener { navigateToIMCApp()}
    }

    private fun navigateToSaludarApp() {
        val intent = Intent(this, FirstAppActivity::class.java )
        startActivity(intent)
    }


    private fun navigateToIMCApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java )
        startActivity(intent)
    }



}