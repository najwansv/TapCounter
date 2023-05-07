package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tombol (view: android.view.View) {
        val textView = findViewById<TextView>(R.id.textview)
        val tectView = findViewById<TextView>(R.id.textView)
        count++

        textView.text = "tombol ditekan $count kali"
        tectView.text = "$count"
    }

    fun reset (view: android.view.View) {
        val textView = findViewById<TextView>(R.id.textview)
        val tectView = findViewById<TextView>(R.id.textView)
        count = 0
        tectView.text = "$count"
        textView.text = "penghitung direset"
    }
}
