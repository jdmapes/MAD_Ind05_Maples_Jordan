package com.example.ind_05_maples_jordan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ind_05_maples_jordan.R.drawable.ic_launcher_background

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateDummyList(500)

        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerview.adapter = ViewAdapter(exampleList)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)

    }

    private fun generateDummyList(size: Int): List<SampleItem> {

        val list = ArrayList<SampleItem>()

        for (i in 0 until size)
        {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_baseline_flag_24
                1 -> ic_launcher_background
                else -> R.drawable.ic_launcher_foreground
            }

            val item = SampleItem(drawable, "Item $i", "Line 2")
            list += item
        }
        return list
    }
}