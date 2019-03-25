package org.wit.placemark

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class MainActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        info("Placemark Activity Started..")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
