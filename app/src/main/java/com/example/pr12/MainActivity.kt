package com.example.pr12

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


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
    fun pear(view: View){
        val photo:ImageView = findViewById(R.id.imageView)
        val image:Int = R.drawable.pear
        val description:String = "Pear"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }
    fun grape(view: View) {
        val photo:ImageView = findViewById(R.id.imageView)
        val image:Int = R.drawable.grape
        val description:String = "Grape"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }
    fun Check(view: View) {
            when (view.id) {
                R.id.checkAppl -> {
                    val imageView: ImageView = findViewById(R.id.imageView2)
                    val checkBox: CheckBox = findViewById(R.id.checkAppl)
                    if (checkBox.isChecked ==true) {
                        imageView.setImageResource(R.drawable.apple)
                    } else {imageView.setImageResource(0)

                    }
                }
                R.id.checkVino -> {
                    val imageView: ImageView = findViewById(R.id.imageView3)
                    val checkBox: CheckBox = findViewById(R.id.checkVino)
                    if (checkBox.isChecked ==true) {
                        imageView.setImageResource(R.drawable.grape)
                    } else {
                        imageView.setImageResource(0)
                    }
                }
                R.id.checkGru -> {
                    val imageView: ImageView = findViewById(R.id.imageView4)
                    val checkBox: CheckBox = findViewById(R.id.checkGru)
                    if (checkBox.isChecked ==true) {
                        imageView.setImageResource(R.drawable.pear)
                    } else {
                        imageView.setImageResource(0)
                    }
                }


            }


    }

}