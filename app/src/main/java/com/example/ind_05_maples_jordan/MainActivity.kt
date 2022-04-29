package com.example.ind_05_maples_jordan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ind_05_maples_jordan.State_Data.stateList
import com.example.ind_05_maples_jordan.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), ViewAdapter.OnItemClickListener {

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerview.adapter = ViewAdapter(stateList, this)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)

    }

    override fun onItemClick(position: Int) {

    }
}