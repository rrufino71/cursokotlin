package com.example.cursoaristidevs.superheroapp

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cursoaristidevs.R
import com.example.cursoaristidevs.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)


    fun bind(superheroItemResponse: SuperheroItemResponse) {
        binding.tvSuperheroName.text = superheroItemResponse.name
        Log.i("response2",superheroItemResponse.superheroImage.url)
        Picasso.get()
            .load(superheroItemResponse.superheroImage.url)
            .into(binding.ivSuperhero)

    }
}