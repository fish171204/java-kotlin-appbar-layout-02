package com.example.appbarlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: LocationAdapter
    private var locationList: MutableList<Location> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        locationList.add(
            Location("Mũi Điện - Phú Yên", "Bình minh trên biển tuyệt đẹp", R.drawable.travel_banner)
        )
        locationList.add(
            Location("Cầu Vàng - Đà Nẵng", "Cây cầu nổi tiếng với bàn tay khổng lồ", R.drawable.cau_vang)
        )
        locationList.add(Location("Nha Trang", "Thiên đường biển đảo", R.drawable.ganh2))

        adapter = LocationAdapter(this, locationList)
        recyclerView.adapter = adapter
    }
}
