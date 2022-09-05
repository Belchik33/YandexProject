package com.example.yandexproject


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yandexproject.databinding.BuisnessListBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: BuisnessListBinding
    private val adapter = BuisnessAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BuisnessListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

    }

    private fun init(){
        binding.apply {

            businessList.adapter = adapter
            businessList.layoutManager = LinearLayoutManager(this@MainActivity)
            adapter.addBusiness(TodoItemsRepository().getTodoList())

        }
        binding.floatingActionButton.setOnClickListener{
            startActivity(Intent(this, NewToDoItem::class.java)) }
    }

}