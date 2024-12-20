package com.example.mybank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.mybank.models.ViewPageModel
import com.example.mybank.utils.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ViewPagerAdapter(this, ViewPageModel.viewPagerList)
        viewPager = findViewById(R.id.viewPager)

        viewPager.adapter = adapter


    }
}