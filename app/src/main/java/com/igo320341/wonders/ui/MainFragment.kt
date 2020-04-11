package com.igo320341.wonders.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.igo320341.wonders.R
import com.igo320341.wonders.activity.DescriptionActivity
import com.igo320341.wonders.di.DaggerMainViewModelComponent
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(){
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val viewModelComponent = DaggerMainViewModelComponent.create()
        viewModel = viewModelComponent.getViewModel()
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        wonder_list.layoutManager = LinearLayoutManager(context)
        viewModel.wonders.observe(viewLifecycleOwner, Observer{
            wonder_list.adapter = WonderRecycleAdapter(it.wonders, viewModel)
        })
        viewModel.wonder.observe(viewLifecycleOwner, Observer {
            val intent = Intent(activity, DescriptionActivity::class.java)
            intent.putExtra(DescriptionFragment.EXTRA_WONDER, it)
            startActivity(intent)
        })
    }
}