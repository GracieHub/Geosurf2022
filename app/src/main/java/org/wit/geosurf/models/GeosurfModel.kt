package org.wit.geosurf.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GeosurfModel(var id: Long = 0,
                          var title: String = "",
                          var description: String = "") : Parcelable