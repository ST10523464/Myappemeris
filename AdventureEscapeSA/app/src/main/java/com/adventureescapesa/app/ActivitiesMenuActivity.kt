package com.adventureescapesa.app

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 8: Individual Activities menu.
// Shows a short intro, then a button for each of the 3 activities.
class ActivitiesMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activities_menu)

        findViewById<WebView>(R.id.webView).loadUrl("file:///android_asset/activities_menu.html")

        findViewById<Button>(R.id.btnZiplining).setOnClickListener {
            startActivity(Intent(this, ZiplineActivity::class.java))
        }
        findViewById<Button>(R.id.btnKayaking).setOnClickListener {
            startActivity(Intent(this, KayakingActivity::class.java))
        }
        findViewById<Button>(R.id.btnRockClimbing).setOnClickListener {
            startActivity(Intent(this, RockClimbingActivity::class.java))
        }
        findViewById<Button>(R.id.btnBack).setOnClickListener { finish() }
    }
}
