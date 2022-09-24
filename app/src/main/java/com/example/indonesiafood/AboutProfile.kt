package com.example.indonesiafood

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AboutProfile : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_profile)

        supportActionBar?.hide()

        val btn_gmail: Button = findViewById(R.id.gmail)
        btn_gmail.setOnClickListener(this)

        val btn_instagram: Button = findViewById(R.id.instagram)
        btn_instagram.setOnClickListener(this)

        val btn_linkedin: Button = findViewById(R.id.linkedin)
        btn_linkedin.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.gmail -> {
                val link = "https://mail.google.com/mail/u/0/?tf=cm&fs=1&to=gfandre3@gmail.com"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }
            R.id.instagram -> {
                val link = "https://www.instagram.com/andrgf_/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }
            R.id.linkedin -> {
                val link = "https://www.linkedin.com/in/andre-gilang-firmansyah/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }
        }
    }
}

