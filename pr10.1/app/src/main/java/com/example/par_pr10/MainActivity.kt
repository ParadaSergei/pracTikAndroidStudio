package com.example.par_pr10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var buttonStatus: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button1(view: View) {
        val button1:TextView = findViewById(R.id.button1)
        val button2:TextView = findViewById(R.id.button2)

        if(buttonStatus == true){
            button1.visibility = View.GONE
        button2.setVisibility(View.VISIBLE)

        }
        else{
            button1.setVisibility(View.VISIBLE)
            button2.setVisibility(View.INVISIBLE)
            buttonStatus = true
        }

    }

    fun button2(view: View) {
        val button1:TextView = findViewById(R.id.button1)
        val button2:TextView = findViewById(R.id.button2)

        if(buttonStatus == true){
            button2.visibility = View.GONE
            button1.setVisibility(View.VISIBLE)

        }
        else{
            button2.setVisibility(View.VISIBLE)
            button1.setVisibility(View.INVISIBLE)
            buttonStatus = true
        }
    }
}