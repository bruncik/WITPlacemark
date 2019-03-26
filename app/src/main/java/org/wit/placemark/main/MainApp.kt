package org.wit.placemark.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.placemark.models.PlacemarkModel

class MainApp: Application(), AnkoLogger {

    val placemarks = ArrayList<PlacemarkModel>()

    override fun onCreate() {
        super.onCreate()
        info("Placemark Started")
        //placemarks.run {
          //  add(PlacemarkModel("One", "About one..."))
            //add(PlacemarkModel("Two", "About two..."))
            //add(PlacemarkModel("Three", "About three..."))

    }
}