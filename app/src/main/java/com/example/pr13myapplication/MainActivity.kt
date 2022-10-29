package com.example.pr13myapplication

import android.app.Activity
import android.app.PendingIntent.getActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun konvert(view: View) {
        val dollText: EditText = findViewById(R.id.editText1)
        val rubText: EditText = findViewById(R.id.editText2)
        var resultText: TextView = findViewById(R.id.textView)
        val doll:Int = dollText.text.toString().toInt()
        val rubl = rubText.text.toString().toInt()
        if (doll!= null){
            val result = doll * rubl
            resultText.text = "Результат : $result"
        } else {

            val toast = Toast.makeText(applicationContext, "Введите курс обмена!", Toast.LENGTH_LONG)
            toast.show()
        }
        if (rubl!=null){

            val toast = Toast.makeText(applicationContext, "Введите сумму для обмена!", Toast.LENGTH_LONG)
            toast.show()
        }
        if (doll == null&&rubl ==null){
            val toast = Toast.makeText(applicationContext,"Не введённые данные!", Toast.LENGTH_LONG)
            toast.show()
        }
    }

}