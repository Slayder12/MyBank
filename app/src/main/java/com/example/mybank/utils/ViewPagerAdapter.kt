package com.example.mybank.utils

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mybank.fragments.ViewPagerFragment
import com.example.mybank.models.ViewPageModel

class ViewPagerAdapter(
    fragment: FragmentActivity,
    private val viewPagerList: MutableList<ViewPageModel>
) :
    FragmentStateAdapter(fragment) {

    override fun getItemCount() = viewPagerList.size

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("vp" to viewPagerList[position])
        return fragment
    }
}