package org.wit.placemark.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.placemark.models.PlacemarkModel
import org.wit.placemark.R
import org.wit.placemark.main.MainApp

class MainActivity : AppCompatActivity(), AnkoLogger {

    var placemark = PlacemarkModel()
    var app : MainApp? = null
    val placemarks = ArrayList<PlacemarkModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        app = application as MainApp

        btnAdd.setOnClickListener() {
            placemark.title = placemarkTitle.text.toString()
            placemark.description = description.text.toString()
            if (placemark.title.isNotEmpty()) {
                app!!.placemarks.add(placemark.copy())
                info("add Button Pressed: $placemarkTitle")
                app!!.placemarks.forEach { info("add button pressed: ${it}")}
                setResult(AppCompatActivity.RESULT_OK)
                finish()
            }
        }

    }
}