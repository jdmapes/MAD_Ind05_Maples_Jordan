package com.example.ind_05_maples_jordan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ind_05_maples_jordan.databinding.ActivityMainBinding

class SeeDaFlag : AppCompatActivity() {

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_see_da_flag)
    }


}