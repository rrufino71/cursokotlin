package com.example.cursoaristidevs.settings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cursoaristidevs.R
import com.example.cursoaristidevs.databinding.ActivitySettingsBinding
import com.example.cursoaristidevs.databinding.ActivitySuperHeroListBinding

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()


    }

    private fun initUi() {
        TODO("Not yet implemented")
    }
}