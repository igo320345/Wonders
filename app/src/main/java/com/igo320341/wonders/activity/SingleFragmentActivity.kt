package com.igo320341.wonders.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.igo320341.wonders.R

abstract class SingleFragmentActivity: AppCompatActivity() {
    protected abstract fun createFragment(): Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frame_container)
        val fragmentManager = supportFragmentManager
        var fragment = fragmentManager.findFragmentById(R.id.frame_container)
        if (fragment == null) {
            fragment = createFragment()
            fragmentManager.beginTransaction().apply {
                add(R.id.frame_container, fragment)
            }.commit()
        }
    }
}