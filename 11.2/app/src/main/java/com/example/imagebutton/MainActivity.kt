package com.example.imagebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickImage(view: View){
        val photo : ImageView = findViewById(R.id.imageButton)
        val image:Int = R.drawable.chargingbattery
        val description:String ="battary"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }
}