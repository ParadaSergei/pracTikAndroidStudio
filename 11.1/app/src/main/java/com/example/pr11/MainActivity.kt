package com.example.pr11

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun imagebotton(view: View) {
        val photo :ImageView = findViewById(R.id.imageView2)
        val image:Int = R.drawable.volcan
        val description:String ="Vulkan"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }
}