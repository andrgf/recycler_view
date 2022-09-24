package com.example.indonesiafood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import de.hdodenhof.circleimageview.CircleImageView

class DetailFood : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "name"
        const val EXTRA_DETAIL = "detail"
        const val EXTRA_IMG = "img"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_food)

        val dataName: TextView = findViewById(R.id.foodName)
        val dataDetail: TextView = findViewById(R.id.detail)
        val dataPhoto: CircleImageView = findViewById(R.id.dataimg)
        val buttonLike: ImageButton = findViewById(R.id.btn_like)
        val buttonShare: ImageButton = findViewById(R.id.btn_share)

        val nameFood = intent.getStringExtra(EXTRA_NAME)
        val detailFood = intent.getStringExtra(EXTRA_DETAIL)
        val imgFood = intent.getIntExtra(EXTRA_IMG, 0)

        dataName.text = nameFood
        dataDetail.text = detailFood
        dataPhoto.setImageResource(imgFood)

        buttonLike.setOnClickListener{
            Toast.makeText(this, "Anda Menyukai " + dataName.text, Toast.LENGTH_SHORT).show()
        }
        buttonShare.setOnClickListener{
            Toast.makeText(this, "Anda Share " + dataName.text, Toast.LENGTH_SHORT).show()
        }

    }

}