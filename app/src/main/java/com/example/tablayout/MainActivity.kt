package com.example.tablayout

import android.content.res.Resources.NotFoundException
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

private lateinit var tabLayout: TabLayout
private lateinit var viewPager: ViewPager2
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = PagerAdapter (this)
        TabLayoutMediator (tabLayout, viewPager) {tab,index ->
            tab.text= when(index){
                0 -> {"Home"}
                1 -> {"Favourite"}
                2 -> {"Settings"}
                else -> {throw NotFoundException("Position Not Found")}
            }
        }.attach()
    }
}