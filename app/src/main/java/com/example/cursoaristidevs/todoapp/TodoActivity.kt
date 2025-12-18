package com.example.cursoaristidevs.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cursoaristidevs.R
import com.example.cursoaristidevs.todoapp.TaskCategory.*

class TodoActivity : AppCompatActivity() {


    //generamos datos para categorias que es como  un enumerado
    private val categories = listOf<TaskCategory>(
        Business,
        Personal,
        Other
    )
    // generamos listado de tareas  para mostrar por categoria
    private val tasks = mutableListOf<Task>(
        Task("Prueba Bussines", Business),
        Task("Prueba Personal", Personal),
        Task("Prueba Bussines", Other)
    )



    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter

    private lateinit var rvTasks: RecyclerView
    private lateinit var tasksAdapter: TasksAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        initComponent()
        initUI()


    }

    private fun initComponent() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)

    }

    private fun initUI() {
        categoriesAdapter = CategoriesAdapter(categories)
        rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        tasksAdapter = TasksAdapter(tasks)
        rvTasks.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvTasks.adapter = tasksAdapter

    }


}