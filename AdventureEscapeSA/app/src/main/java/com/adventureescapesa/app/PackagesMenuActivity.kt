package com.adventureescapesa.app

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 3: Adventure Packages menu.
// Shows a short intro, then a button for each of the 4 packages.
class PackagesMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_packages_menu)

        findViewById<WebView>(R.id.webView).loadUrl("file:///android_asset/packages_menu.html")

        findViewById<Button>(R.id.btnUltimate).setOnClickListener {
            startActivity(Intent(this, UltimateAdventureDayActivity::class.java))
        }
        findViewById<Button>(R.id.btnFamily).setOnClickListener {
            startActivity(Intent(this, FamilyExplorerActivity::class.java))
        }
        findViewById<Button>(R.id.btnMountain).setOnClickListener {
            startActivity(Intent(this, MountainAdventureActivity::class.java))
        }
        findViewById<Button>(R.id.btnCorporate).setOnClickListener {
            startActivity(Intent(this, CorporateChallengeActivity::class.java))
        }
        findViewById<Button>(R.id.btnBack).setOnClickListener { finish() }
    }
}
