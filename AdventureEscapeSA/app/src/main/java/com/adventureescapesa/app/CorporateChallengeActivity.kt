package com.adventureescapesa.app

import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 7: Corporate Team Challenge
class CorporateChallengeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        findViewById<WebView>(R.id.webView).loadUrl("file:///android_asset/package_corporate.html")
        findViewById<Button>(R.id.btnBack).setOnClickListener { finish() }
    }
}
