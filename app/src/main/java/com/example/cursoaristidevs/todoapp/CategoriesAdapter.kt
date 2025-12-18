package com.example.cursoaristidevs.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cursoaristidevs.R

class CategoriesAdapter(private var categories: List<TaskCategory>, private val onItemSelected:(Int)-> Unit) :
    RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category,parent,false)
        return CategoriesViewHolder(view)
    }


    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        //onItemSelected lo estoy mandando, si le pongo parentesis lo estoy ejecutando
        //esta es otra forma de utilizar funciones lambda
        holder.render(categories[position], onItemSelected)
    }

    override fun getItemCount() = categories.size


}