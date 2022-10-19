package org.wit.geosurf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class GeosurfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geosurf)

        Timber.plant(Timber.DebugTree())

        Timber.i("Geosurf Activity started..")
    }
}