package org.wit.geosurf.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import org.wit.geosurf.databinding.ActivityGeosurfBinding
import org.wit.geosurf.models.GeosurfModel
import timber.log.Timber
import timber.log.Timber.i

class GeosurfActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGeosurfBinding
    var geosurf = GeosurfModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGeosurfBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Timber.plant(Timber.DebugTree())

        i("Gesourf Activity started...")

        binding.btnAdd.setOnClickListener() {
            geosurf.title = binding.geosurfTitle.text.toString()
            if (geosurf.title.isNotEmpty()) {
                i("add Button Pressed: $geosurf.title")
            }
            else {
                Snackbar
                    .make(it,"Please Enter a title", Snackbar.LENGTH_LONG)
                    .show()
            }
        }
    }
}