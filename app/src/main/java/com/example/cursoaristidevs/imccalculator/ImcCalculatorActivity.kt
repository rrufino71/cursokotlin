package com.example.cursoaristidevs.imccalculator

import android.content.Intent
import android.icu.text.DecimalFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.cursoaristidevs.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider

class ImcCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected:Boolean = true
    private var isFemaleSelected:Boolean = false
    private var currentWeight:Int = 60
    private var currentAge:Int = 21
    private var currentHeight:Int=120


    // se declara pero no se inicia
    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private lateinit var tvHeight:TextView
    private lateinit var rsHeight:RangeSlider
    private lateinit var btnSubtractWeight:FloatingActionButton
    private lateinit var btnPlusWeight:FloatingActionButton
    private lateinit var tvWeight:TextView
    private lateinit var btnSubtractAge:FloatingActionButton
    private lateinit var btnPlusAge:FloatingActionButton
    private lateinit var tvAge:TextView
    private lateinit var btnCalculate: Button

    //definicion de constantes publicas
    companion object{
        const val IMC_KEY = "IMC_RESULT"   //define el nombre de la clave
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        initComponents()
        initListeners()
        initUI()

    }

    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
        btnPlusWeight = findViewById(R.id.btnPlusWeight)
        btnSubtractWeight = findViewById(R.id.btnSubtractWeight)
        tvWeight = findViewById(R.id.tvWeight)
        btnPlusAge = findViewById(R.id.btnPlusAge)
        btnSubtractAge = findViewById(R.id.btnSubtractAge)
        tvAge = findViewById(R.id.tvAge)
        btnCalculate = findViewById(R.id.btnCalculate)

    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun initListeners() {
        viewMale.setOnClickListener {
            changeGender()
            setGenderColor()
        }

        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        rsHeight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            currentHeight = df.format(value).toInt()
            tvHeight.text = "$currentHeight cm"
        }

        btnPlusWeight.setOnClickListener {
            currentWeight +=  1
            setWeight()
        }

        btnSubtractWeight.setOnClickListener {
            currentWeight -=  1
            setWeight()
        }

        btnPlusAge.setOnClickListener {
            currentAge +=  1
            setAge()
        }

        btnSubtractAge.setOnClickListener {
            currentAge -=  1
            setAge()
        }

        btnCalculate.setOnClickListener{
            val result = calculateIMC()
            navigateToResult(result)
        }

    }

    private fun navigateToResult(result: Double) {
        val intent = Intent(this,ResultIMCActivity::class.java)
        intent.putExtra(IMC_KEY,result)
        startActivity(intent)
    }

    private fun calculateIMC():Double {
       val df=DecimalFormat("#.##")
        val imc = currentWeight / (currentHeight.toDouble()/100 * currentHeight.toDouble()/100)
        //val result = df.format(imc).toDouble()
        //Log.i("imc","El imc es $result")
        return df.format(imc).toDouble()
    }

    private fun setWeight(){
        tvWeight.text = currentWeight.toString()
    }

    private fun setAge(){
        tvAge.text = currentAge.toString()
    }

    private fun changeGender() {
            isMaleSelected= !isMaleSelected
            isFemaleSelected = !isFemaleSelected
    }

    private fun setGenderColor() {
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent:Boolean):Int {
        val colorReference = if(isSelectedComponent) {
            R.color.background_component_selected
        }else {
            R.color.background_component
        }
        return ContextCompat.getColor(this,colorReference)
    }
    private fun initUI() {
        setGenderColor()
        setWeight()
        setAge()
    }
}
