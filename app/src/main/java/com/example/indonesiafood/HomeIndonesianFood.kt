package com.example.indonesiafood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeIndonesianFood : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_indonesian_food)

        val button_menu_makanan: Button = findViewById(R.id.manu_makanan)
        val button_about: Button = findViewById(R.id.about)

        button_menu_makanan.setOnClickListener {
            val intent = Intent(this@HomeIndonesianFood, ListFood::class.java)
            startActivity(intent)
        }

        button_about.setOnClickListener {
            val intent = Intent(this@HomeIndonesianFood, AboutProfile::class.java)
            startActivity(intent)
        }

    }
}