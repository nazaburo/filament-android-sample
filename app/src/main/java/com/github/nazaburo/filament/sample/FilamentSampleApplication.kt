package com.github.nazaburo.filament.sample

import android.app.Application
import com.google.android.filament.Filament

class FilamentSampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Filament.init()
    }
}