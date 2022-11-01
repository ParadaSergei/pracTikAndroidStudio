package com.example.stylestems

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
 //       setTheme(R.style.Theme_AppCompat_whiteStile)
        setContentView(R.layout.activity_main)
    }
    fun buttonPerhod(view: View) {
        val intent:Intent = Intent(this@MainActivity,Darkmain::class.java)
        intent.addFlags(
            Intent.FLAG_ACTIVITY_CLEAR_TOP or
                    Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }
}