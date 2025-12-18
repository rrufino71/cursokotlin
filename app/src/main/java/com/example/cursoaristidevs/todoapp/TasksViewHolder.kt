package com.example.cursoaristidevs.todoapp

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cursoaristidevs.R

class TasksViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvTask:TextView = view.findViewById<TextView>(R.id.tvTask)
    private val cbTastk:CheckBox = view.findViewById<CheckBox>(R.id.cbTask)
    fun render(task: Task) {

            tvTask.text=task.name

    }

}