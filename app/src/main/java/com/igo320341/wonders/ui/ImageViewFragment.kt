package com.igo320341.wonders.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.igo320341.wonders.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.image_slide_page.*

class ImageViewFragment(private val image: String): Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.image_slide_page, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Picasso.get().load(image).into(wonder_image)
    }
}