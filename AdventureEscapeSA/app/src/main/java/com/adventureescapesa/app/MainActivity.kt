package com.adventureescapesa.app

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 1: Home.
// Shows a short welcome message (from index.html) plus 4 menu buttons
// that open the rest of the app.
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl("file:///android_asset/index.html")

        findViewById<Button>(R.id.btnAbout).setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        findViewById<Button>(R.id.btnPackages).setOnClickListener {
            startActivity(Intent(this, PackagesMenuActivity::class.java))
        }

        findViewById<Button>(R.id.btnActivities).setOnClickListener {
            startActivity(Intent(this, ActivitiesMenuActivity::class.java))
        }

        findViewById<Button>(R.id.btnBooking).setOnClickListener {
            startActivity(Intent(this, BookingActivity::class.java))
        }
    }
}
