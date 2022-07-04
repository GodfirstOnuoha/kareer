 package com.godfirst.kareer.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.godfirst.kareer.R

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Kareer)
        setContentView(R.layout.activity_main)
    }
}