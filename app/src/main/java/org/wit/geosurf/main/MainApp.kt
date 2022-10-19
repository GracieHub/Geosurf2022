package org.wit.geosurf.main

import android.app.Application
import org.wit.geosurf.models.GeosurfMemStore
import org.wit.geosurf.models.GeosurfModel
import timber.log.Timber
import timber.log.Timber.i

class MainApp : Application() {

    // val geosurfs = ArrayList<GeosurfModel>()
    val geosurfs = GeosurfMemStore()

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        i("Geosurf started")
    }
}