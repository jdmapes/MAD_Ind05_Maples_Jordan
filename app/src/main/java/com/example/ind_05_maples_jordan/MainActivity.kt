package com.example.ind_05_maples_jordan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        val stateName = stateList[position].stateName
        val nickName = stateList[position].nickName
        val stateSize = stateList[position].stateArea
        val stOutline = stateList[position].outline
        val stFlag = stateList[position].stateFlag
 
        val state = State_Info(stateName, nickName, stateSize, stOutline, stFlag)

        // Grab "position" and display population, flag and state outline in MainActivity2 Activity
        val intent = Intent(this, MainActivity2::class.java)
            .putExtra("EXTRA_AREA", state)

        Toast.makeText(this, stateName + " " + nickName, Toast.LENGTH_SHORT).show()
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()

        this.binding = null
    }
}