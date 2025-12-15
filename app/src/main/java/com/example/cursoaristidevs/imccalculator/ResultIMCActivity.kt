package com.example.cursoaristidevs.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.cursoaristidevs.R
import com.example.cursoaristidevs.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult:TextView
    private lateinit var tvDescription:TextView
    private lateinit var tvIMC:TextView
    private lateinit var btnRecalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)
        //Si no tiene extras devuelve -1.0
        val result:Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
        initListeners()

    }

    private fun initListeners() {
       btnRecalculate.setOnClickListener {onBackPressed()}

    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when(result){
            //Bajo peso
            in 0.00..18.50 -> {
                tvResult.text=getString(R.string.title_bajo_peso)
                tvResult.setTextColor(
                    ContextCompat.getColor(this,R.color.peso_bajo))
                tvDescription.text=getString(R.string.description_bajo_peso)

            }
            //Normal
            in 18.51..24.99 -> {
                tvResult.text=getString(R.string.title_peso_normal)
                tvResult.setTextColor(
                    ContextCompat.getColor(this,R.color.peso_normal))
                tvDescription.text=getString(R.string.description_peso_normal)

            }
            //Sobrepeso
            in 25.00..29.99 -> {
                tvResult.text=getString(R.string.title_sobrepeso)
                tvResult.setTextColor(
                    ContextCompat.getColor(this,R.color.peso_sobrepeso))
                tvDescription.text=getString(R.string.description_sobrepeso)
            }
            //Obecidad
            in 30.00..199.99 -> {
                tvResult.text=getString(R.string.title_obesidad)
                tvResult.setTextColor(
                    ContextCompat.getColor(this,R.color.peso_obesidad))

                tvDescription.text=getString(R.string.description_obesidad)

            }
            else -> {
                tvIMC.text=getString(R.string.error)
                tvResult.text=getString(R.string.error)
                tvResult.setTextColor(
                    ContextCompat.getColor(this,R.color.peso_obesidad))
                tvDescription.text=getString(R.string.error)
            }
        }


    }

    private fun initComponents() {
        tvResult = findViewById(R.id.tvResult)
        tvDescription = findViewById(R.id.tvDescription)
        tvIMC = findViewById(R.id.tvIMC)
        btnRecalculate = findViewById(R.id.btnRecalculate)

    }
}