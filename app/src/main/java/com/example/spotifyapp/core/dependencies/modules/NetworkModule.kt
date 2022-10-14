package com.example.spotifyapp.core.dependencies.modules

import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.android.AndroidInjector

@Module
abstract class NetworkModule: AndroidInjector<AppCompatActivity> {
}