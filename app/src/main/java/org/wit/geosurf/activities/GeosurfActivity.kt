package org.wit.geosurf.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar
import org.wit.geosurf.R
import org.wit.geosurf.databinding.ActivityGeosurfBinding
import org.wit.geosurf.main.MainApp
import org.wit.geosurf.models.GeosurfModel
import timber.log.Timber
import timber.log.Timber.i

class GeosurfActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGeosurfBinding
    var geosurf = GeosurfModel()
    //val geosurfs = ArrayList<GeosurfModel>()
    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var edit = false

        binding = ActivityGeosurfBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarAdd.title = title
        setSupportActionBar(binding.toolbarAdd)

        app = application as MainApp

        i("Geosurf Activity started...")

        if (intent.hasExtra("geosurf_edit")) {
            edit = true
            geosurf = intent.extras?.getParcelable("geosurf_edit")!!
            binding.geosurfTitle.setText(geosurf.title)
            binding.description.setText(geosurf.description)
            binding.btnAdd.setText(R.string.save_geosurf)
        }

        binding.btnAdd.setOnClickListener() {
            geosurf.title = binding.geosurfTitle.text.toString()
            geosurf.description = binding.description.text.toString()
            if (geosurf.title.isEmpty()) {
                Snackbar.make(it,R.string.enter_geosurf_title, Snackbar.LENGTH_LONG)
                    .show()
            } else {
                if (edit) {
                    app.geosurfs.update(geosurf.copy())
                } else {
                    app.geosurfs.create(geosurf.copy())
                }
            }
            i("add Button Pressed: $geosurf")
            setResult(RESULT_OK)
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_geosurf, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_cancel -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}