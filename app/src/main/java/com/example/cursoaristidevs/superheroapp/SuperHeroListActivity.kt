package com.example.cursoaristidevs.superheroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cursoaristidevs.databinding.ActivitySuperHeroListBinding
import com.example.cursoaristidevs.superheroapp.DetailSuperheroActivity.Companion.EXTRA_ID
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SuperHeroListActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySuperHeroListBinding
    private lateinit var retrofit: Retrofit

    private lateinit var adapter: SuperheroAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuperHeroListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        retrofit = getRetrofit()
        initUi()

    }

    private fun initUi() {

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
           //cuando pulso el boton buscar
            override fun onQueryTextSubmit(query: String?): Boolean {
               searchByName(query.orEmpty()) //si es nulo devuelvo un texto vacio

               return false //siempre se retorna false
            }

            //cuando cambio el texto
            //override fun onQueryTextChange(newText: String?): Boolean {
            //    return false
            //}
            override fun onQueryTextChange(newText: String?) = false

        })

        adapter = SuperheroAdapter {superheroId -> navigateToDetail(superheroId)} //este metodo recibe un parametro superheroId
        binding.rvSuperhero.setHasFixedSize(true)
        binding.rvSuperhero.layoutManager = LinearLayoutManager(this)
        binding.rvSuperhero.adapter = adapter


    }

    private fun searchByName(query: String) {
        //se ejecuta en un hilo secundario
        binding.progressBar.isVisible = true
        CoroutineScope(Dispatchers.IO).launch {
            val myResponse: Response<SuperHeroDataResponse> = retrofit.create(ApiService::class.java).getSuperheroes(query)
            if(myResponse.isSuccessful) {
                Log.i("aris","Funciona :)")
                val response: SuperHeroDataResponse? = myResponse.body()
                if(response != null){
                    Log.i("response",response.toString())
                    runOnUiThread {
                        // no se puede llamar a la ui desde una coroutineScope
                        adapter.updateList(response.superheroes)
                        binding.progressBar.isVisible = false // lo pone en gone
                    }

                }

            }else{
                Log.i("aris","No nunciona :(")
            }
        }
    }


    private fun getRetrofit():Retrofit {
        return Retrofit
            .Builder()
            .baseUrl("https://superheroapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun navigateToDetail(id:String) {
        val intent = Intent(this, DetailSuperheroActivity::class.java)
        intent.putExtra(EXTRA_ID,id)
        startActivity(intent)
    }

}

