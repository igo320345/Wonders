package com.igo320341.wonders.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.igo320341.wonders.R
import com.igo320341.wonders.model.Wonder
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_description.*


class DescriptionFragment: Fragment() {
    private lateinit var wonder: Wonder
    private lateinit var activity: AppCompatActivity
    companion object{
        const val EXTRA_WONDER = "com.igo320341.wonders.model"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity = requireActivity() as AppCompatActivity
        wonder = activity.intent.getSerializableExtra(EXTRA_WONDER) as Wonder
        return inflater.inflate(R.layout.fragment_description, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        description_toolbar.title = wonder.name
        activity.setSupportActionBar(description_toolbar)
        activity.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        Picasso.get().load(wonder.pictureUrl).into(wonder_image)
    }

}