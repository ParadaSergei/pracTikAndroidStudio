package com.example.pr12

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    val check1:CheckBox = findViewById(R.id.checkBox)
    val check2:CheckBox = findViewById(R.id.checkBox2)
    val check3:CheckBox = findViewById(R.id.checkBox3)
    var bool:Boolean = false

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
        var imageView4:ImageView = findViewById(R.id.imageView4)

    if (check1.isChecked == true){
    imageView4.setVisibility(View.VISIBLE)
}
        else{
    imageView4.setVisibility(View.GONE)

        }
    }
    fun grapeCheck(view: View) {
        var imageView3:ImageView = findViewById(R.id.imageView3)
        if (check2.isChecked == true){
            imageView3.setVisibility(View.VISIBLE)
        }
        else{
            imageView3.setVisibility(View.GONE)
        }
    }
    fun appleCheck(view: View){
        var imageView2:ImageView = findViewById(R.id.imageView2)
        if (check3.isChecked == true){
            imageView2.setVisibility(View.VISIBLE)
        }
        else{
            imageView2.setVisibility(View.GONE)
        }



}}