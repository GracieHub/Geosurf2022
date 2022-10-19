package org.wit.geosurf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber
import timber.log.Timber.i

class GeosurfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geosurf)

        Timber.plant(Timber.DebugTree())

        i("Geosurf Activity started..")
    }
}