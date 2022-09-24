package com.example.indonesiafood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFood : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_food)

        this.setTitle("Menu Makanan")

        rvFood = findViewById(R.id.rv_food)
        rvFood.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showListFood()
    }

    private fun showListFood() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val adapterFood = Adapter(list)
        rvFood.adapter = adapterFood
    }
}