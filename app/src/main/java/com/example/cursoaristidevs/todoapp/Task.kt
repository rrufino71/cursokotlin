package com.example.cursoaristidevs.todoapp

data class Task (val name: String, val category: TaskCategory, var isSelected: Boolean = false)
