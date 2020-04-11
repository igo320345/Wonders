package com.igo320341.wonders.di

import com.igo320341.wonders.ui.MainViewModel
import dagger.Component

@Component(modules = [MainViewModelModule::class])
interface MainViewModelComponent {
    fun getViewModel(): MainViewModel
}