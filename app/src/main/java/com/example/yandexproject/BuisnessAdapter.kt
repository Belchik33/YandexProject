package com.example.yandexproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yandexproject.databinding.BuisnessItemBinding

class BuisnessAdapter: RecyclerView.Adapter<BuisnessAdapter.BuisnessHolder>() {

    val todoList = ArrayList<TodoItem>()
    class BuisnessHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = BuisnessItemBinding.bind(item)
        fun bind(todoItem : TodoItem) = with(binding){
            textView.text = todoItem.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuisnessHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.buisness_item, parent, false)
        return BuisnessHolder(view)
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

    override fun onBindViewHolder(holder: BuisnessHolder, position: Int) {
        holder.bind(todoList[position])
    }

    fun addBusiness(todoItem:  ArrayList<TodoItem>){
        todoList.addAll(todoItem)
        notifyDataSetChanged()
    }
}