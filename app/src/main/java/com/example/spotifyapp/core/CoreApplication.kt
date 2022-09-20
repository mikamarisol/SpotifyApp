package com.example.spotifyapp.core

import com.example.spotifyapp.core.dependencies.ApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

abstract class CoreApplication: DaggerApplication() {

    abstract val appComponent = ApplicationComponent

    override fun applicationInjector() = appComponent

}