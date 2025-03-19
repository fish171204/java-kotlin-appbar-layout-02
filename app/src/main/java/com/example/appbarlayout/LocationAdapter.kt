package com.example.appbarlayout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class LocationAdapter(private val context: Context, private val locations: List<Location>) :
    RecyclerView.Adapter<LocationAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_location, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val location = locations[position]
        holder.locationName.text = location.name
        holder.locationDescription.text = location.description
        holder.locationImage.setImageResource(location.imageResId)
    }

    override fun getItemCount(): Int {
        return locations.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var locationImage: ImageView = itemView.findViewById(R.id.locationImage)
        var locationName: TextView = itemView.findViewById(R.id.locationName)
        var locationDescription: TextView = itemView.findViewById(R.id.locationDescription)
    }
}
