package com.igo320341.wonders.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ImageViewPagerAdapter(fragmentActivity: FragmentActivity, private val imageList: List<String>): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun createFragment(position: Int): Fragment {
        return ImageViewFragment(imageList[position])
    }
}