package com.example.yandexproject

import java.util.Date

data class TodoItem(val id: String, val text: String, val importanceDegree: String, val dateDeadLine: Date,
                    val isDid: Boolean, val dateCreate: Date, val dateChange: Date )

fun importanceDegree(id: Int) : String {
    when(id){
        1 -> return "низкая"
        2 -> return "обычная"
        3 -> return "срочная"
    }
    return "низкая"
}