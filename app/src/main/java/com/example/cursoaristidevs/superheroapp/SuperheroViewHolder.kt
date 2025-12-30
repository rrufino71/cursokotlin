package com.example.cursoaristidevs.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cursoaristidevs.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)


    fun bind(superheroItemResponse: SuperheroItemResponse, onItemSelected: (String) -> Unit) {
        binding.tvSuperheroName.text = superheroItemResponse.name

        //Picasso.get()
        //    .load(superheroItemResponse.superheroImage.url)
        //    .into(binding.ivSuperhero)

        Picasso.get()
            .load("https://picsum.photos/200/300")
            .into(binding.ivSuperhero)




        binding.root.setOnClickListener { onItemSelected(superheroItemResponse.superheroId)

        }

    }
}