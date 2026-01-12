package com.example.cursoaristidevs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cursoaristidevs.firstapp.FirstAppActivity
import com.example.cursoaristidevs.imccalculator.ImcCalculatorActivity
import com.example.cursoaristidevs.settings.SettingsActivity
import com.example.cursoaristidevs.superheroapp.SuperHeroListActivity
import com.example.cursoaristidevs.todoapp.TodoActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludarApp = findViewById<Button>(R.id.btnSaludarApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnSuperHeroApp = findViewById<Button>(R.id.btnSuperHeroApp)
        val btnSettings = findViewById<Button>(R.id.btnSettings)

        btnSaludarApp.setOnClickListener { navigateToSaludarApp()}
        btnIMCApp.setOnClickListener { navigateToIMCApp()}
        btnTODO.setOnClickListener { navigateToTodoApp()}
        btnSuperHeroApp.setOnClickListener { navigateToSuperHeroApp()}
        btnSettings.setOnClickListener { navigateToSettings()}

    }


    private fun navigateToSettings() {
        val intent = Intent(this, SettingsActivity::class.java )
        startActivity(intent)
    }

    private fun navigateToSuperHeroApp() {
        val intent = Intent(this, SuperHeroListActivity::class.java )
        startActivity(intent)
    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java )
        startActivity(intent)
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