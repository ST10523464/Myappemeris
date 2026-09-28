package com.adventureescapesa.app

import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 11: Rock Climbing Session
class RockClimbingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        findViewById<WebView>(R.id.webView).loadUrl("file:///android_asset/activity_rockclimbing.html")
        findViewById<Button>(R.id.btnBack).setOnClickListener { finish() }
    }
}
