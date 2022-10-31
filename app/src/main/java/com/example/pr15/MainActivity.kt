package com.example.pr15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun DataBut(view: View) {
        val poroda:EditText = findViewById(R.id.editTextPoroda)
        val age:EditText = findViewById(R.id.editTextAge)
        val month:EditText = findViewById(R.id.editTextMonth)
        val porodas = poroda.text.toString()
        val ages = age.text.toString()
        val months = month.text.toString()
        val user : AnimalsActivity.User = AnimalsActivity.User (porodas, ages, months)
        val intent: Intent = Intent(
            this@MainActivity,
            AnimalsActivity::class.java)
        intent.putExtra(user.javaClass.simpleName, user)
        when (view.id){
            R.id.button -> startActivity(intent)
        }
    }
}