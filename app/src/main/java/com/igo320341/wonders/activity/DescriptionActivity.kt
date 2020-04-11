package com.igo320341.wonders.activity

import androidx.fragment.app.Fragment
import com.igo320341.wonders.ui.DescriptionFragment

class DescriptionActivity: SingleFragmentActivity(){
    override fun createFragment(): Fragment {
        return DescriptionFragment()
    }

}