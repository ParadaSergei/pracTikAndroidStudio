package com.example.pr12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.ToggleButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun apple(view: View){
        val photo: ImageView = findViewById(R.id.imageView)
        val image:Int = R.drawable.apple
        val description:String = "Apple"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }
    fun pear(view:View){
        val photo:ImageView = findViewById(R.id.imageView)
        val image:Int = R.drawable.pear
        val description:String = "Pear"
        photo.setImageResource(image)
        photo.setContentDescription(description)

    }
    fun grape(view: View){
        val photo:ImageView = findViewById(R.id.imageView)
        val image:Int = R.drawable.grape
        val description:String = "Grape"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }
    fun pearCheck(view: View){
            val photo:ImageView = findViewById(R.id.imageView5)
            val image:Int = R.drawable.pear
            val description:String = "Pear"
            photo.setImageResource(image)
            photo.setContentDescription(description)

    }
    fun appleCheck(view: View){

            val photo:ImageView = findViewById(R.id.imageView4)
            val image:Int = R.drawable.apple
            val description:String = "Apple"
            photo.setImageResource(image)
            photo.setContentDescription(description)
    }
    fun grapeCheck(view: View){
            val photo:ImageView = findViewById(R.id.imageView3)
            val image:Int = R.drawable.grape
            val description:String = "Grape"
            photo.setImageResource(image)
            photo.setContentDescription(description)

    }
}