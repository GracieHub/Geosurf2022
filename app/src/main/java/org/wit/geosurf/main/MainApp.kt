package org.wit.geosurf.main

import android.app.Application
import org.wit.geosurf.models.GeosurfJSONStore
import org.wit.geosurf.models.GeosurfMemStore
import org.wit.geosurf.models.GeosurfStore
import timber.log.Timber
import timber.log.Timber.i

class MainApp : Application() {

    lateinit var geosurfs: GeosurfStore

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        geosurfs = GeosurfJSONStore(applicationContext)
        i("Geosurf started")
    }
}