package org.wit.geosurf.activities

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import org.wit.geosurf.R
import org.wit.geosurf.adapters.GeosurfAdapter
import org.wit.geosurf.adapters.GeosurfListener
import org.wit.geosurf.databinding.ActivityGeosurfListBinding
import org.wit.geosurf.main.MainApp
import org.wit.geosurf.models.GeosurfModel

class GeosurfListActivity : AppCompatActivity(), GeosurfListener {

    lateinit var app: MainApp
    private lateinit var binding: ActivityGeosurfListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGeosurfListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar.title = title
        setSupportActionBar(binding.toolbar)

        app = application as MainApp

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = GeosurfAdapter(app.geosurfs.findAll(),this)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_add -> {
                val launcherIntent = Intent(this, GeosurfActivity::class.java)
                startActivityForResult(launcherIntent,0)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onGeosurfClick(geosurf: GeosurfModel) {
        val launcherIntent = Intent(this, GeosurfActivity::class.java)
        launcherIntent.putExtra("geosurf_edit", geosurf)
        startActivityForResult(launcherIntent,0)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        binding.recyclerView.adapter?.notifyDataSetChanged()
        super.onActivityResult(requestCode, resultCode, data)
    }
}