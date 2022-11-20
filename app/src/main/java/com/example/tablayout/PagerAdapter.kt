package com.example.tablayout

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter  (fragmentActivity: FragmentActivity) :FragmentStateAdapter(fragmentActivity){
    override fun getItemCount() =3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> {HomeFragment()}
            1-> {FavouriteFragment()}
            2-> {SettingsFragment()}

            else -> {throw Resources.NotFoundException("Position Not Found")}
        }
    }

}