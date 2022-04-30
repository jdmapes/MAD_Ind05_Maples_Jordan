package com.example.ind_05_maples_jordan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ind_05_maples_jordan.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    var binding: ActivityMain2Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding?.root)

        // Display a back button in the action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val extras = intent.extras

        if(extras == null) {
            onSupportNavigateUp()
        }
        else {
            // Populate views from class object data
            val state = intent.getSerializableExtra("EXTRA_AREA") as State_Info
            println(intent.getStringExtra(state.stateArea.toString()))
            binding?.area?.text = "Area: " + state.stateArea.toString() + " Sq Miles"
            binding?.stateOutline?.setImageResource(state.outline)
            binding?.flagImage?.setImageResource(state.stateFlag)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        // Call "finish" to initiate a return to the source
        finish()
        return super.onSupportNavigateUp()
    }

}