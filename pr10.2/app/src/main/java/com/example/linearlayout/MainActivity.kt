package com.example.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linearlayout)
        setTitle("LinearLayout")
    }
    fun orientVertical(view: View){
        val text:TextView=findViewById(R.id.textView2)
        text.setText("Вертикальное")
    }
    fun orientHorizontal(view: View){
        val text:TextView=findViewById(R.id.textView2)
        text.setText("Горизонтальное")
    }
    fun gravityLeft(view: View){
        val text:TextView=findViewById(R.id.textView4)
        text.setText("по левой границе")
    }
    fun gravityRight(view: View){
        val text:TextView=findViewById(R.id.textView4)
        text.setText("по правой границе")
    }
    fun gravityCenter(view: View){
        val text:TextView=findViewById(R.id.textView4)
        text.setText("по центру")
    }
}