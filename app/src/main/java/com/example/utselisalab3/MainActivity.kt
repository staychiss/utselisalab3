package com.example.utselisalab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.utselisalab3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerContainer.layoutManager = layoutManager
        setList()
    }
    private fun setList() {
        val dataList: ArrayList<category> = ArrayList()
        dataList.add(category( R.drawable.saladungu, "Greek Salad with Lettuce,Green Onion", "150 kcal"))
        dataList.add(category( R.drawable.saladbiru, "Salad Of Fresh Vegetables", "270 kcal"))



        val adapter = itemlist(dataList)
        binding.recyclerContainer.adapter = adapter
    }

}