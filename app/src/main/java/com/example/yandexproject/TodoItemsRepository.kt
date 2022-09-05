package com.example.yandexproject

import java.util.*
import kotlin.collections.ArrayList

class TodoItemsRepository {

    private val todoList = ArrayList<TodoItem>()

    fun getTodoList() : ArrayList<TodoItem> {
        addItem()
        return todoList
    }
    fun add(todoItem: TodoItem){
        todoList.add(todoItem)
    }

    private fun addItem(){
        todoList.add(
             TodoItem("1","animeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanimeanime", importanceDegree(1), Date(1),true,Date(1),Date(1))
        )
        todoList.add(
            TodoItem("2","2", importanceDegree(1), Date(1),true,Date(1),Date(1))
        )
        todoList.add(
            TodoItem("3","3", importanceDegree(1), Date(1),true,Date(1),Date(1))
        )
        todoList.add(
            TodoItem("4","4", importanceDegree(1), Date(1),true,Date(1),Date(1))
        )
        todoList.add(
            TodoItem("5","5", importanceDegree(1), Date(1),true,Date(1),Date(1))
        )
        todoList.add(
            TodoItem("6","6", importanceDegree(1), Date(1),true,Date(1),Date(1))
        )
        todoList.add(
            TodoItem("7","7", importanceDegree(1), Date(1),true,Date(1),Date(1))
        )
        todoList.add(
            TodoItem("8","8", importanceDegree(1), Date(1),true,Date(1),Date(1))
        )
        todoList.add(
            TodoItem("9","9", importanceDegree(1), Date(1),true,Date(1),Date(1))
        )
        todoList.add(
            TodoItem("10","10", importanceDegree(1), Date(1),true,Date(1),Date(1))
        )
    }



}