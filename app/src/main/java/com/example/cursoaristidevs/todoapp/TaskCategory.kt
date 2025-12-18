package com.example.cursoaristidevs.todoapp

//si es un dataclass se define en cada objeto o
//si las propiedades son distintas para cada objeto
//si es una sealed class se define en la clase de la sealed

sealed class TaskCategory(var isSelected: Boolean = true) {
    object Personal :TaskCategory()
    object Business:TaskCategory()
    object Other:TaskCategory()
}


