package com.example.recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val items = listOf<Moviemodel>(
            Moviemodel( " Movie 1"),
            Moviemodel( " Movie 2"),
            Moviemodel( " Movie 3"),
            Moviemodel( " Movie 4")
            )
        val adapter =  MovieRecyclerAdapter(items)
        recyclerView.adapter = adapter
    }
}

data class Moviemodel(val name:String?=null){

}