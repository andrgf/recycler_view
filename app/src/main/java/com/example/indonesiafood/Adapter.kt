package com.example.indonesiafood

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class Adapter(private val listFood: ArrayList<Food>) : RecyclerView.Adapter<Adapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(75, 75))
            .into(holder.imgPhoto)

        holder.txtName.text = food.name
        holder.txtDetail.text = food.detail
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailFood::class.java)
            intent.putExtra(DetailFood.EXTRA_NAME, food.name)
            intent.putExtra(DetailFood.EXTRA_DETAIL, food.detail)
            intent.putExtra(DetailFood.EXTRA_IMG, food.photo)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView = itemView.findViewById(R.id.item_name)
        var txtDetail: TextView = itemView.findViewById(R.id.item_detail)
        var imgPhoto: CircleImageView = itemView.findViewById(R.id.item_photo)
    }
}