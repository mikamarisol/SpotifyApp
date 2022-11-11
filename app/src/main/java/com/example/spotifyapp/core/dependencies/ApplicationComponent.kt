package com.example.spotifyapp.core.dependencies

import android.app.Application
import com.example.spotifyapp.core.CoreApplication
import com.example.spotifyapp.core.dependencies.modules.ActivityModule
import com.example.spotifyapp.core.dependencies.modules.ApplicationModule
import com.example.spotifyapp.core.dependencies.modules.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        (AndroidSupportInjectionModule::class),
        (ApplicationModule::class),
        (ActivityModule::class),
        (NetworkModule::class)
    ]
)

interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun network(networkModule: NetworkModule): Builder
        fun build(): ApplicationComponent

    }

    override fun inject(instance: DaggerApplication) {
    }
}