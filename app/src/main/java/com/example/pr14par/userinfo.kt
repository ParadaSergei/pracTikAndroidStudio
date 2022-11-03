package com.example.pr14par

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract

class userinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userinfo)
        val argument : Bundle? = intent.extras
        val emailText : EditText = findViewById(R.id.emailEditText)
        val nameText : EditText = findViewById(R.id.nameEditText)
        val ageText : EditText = findViewById(R.id.ageTextNumber)
        if (argument != null) {
            emailText.setText(argument.get("email").toString())
            nameText.setText(argument.get("name").toString())
            ageText.setText(argument.get("age").toString())
        }
    }
    fun transitions(view: View) {
        val argument : Bundle? = intent.extras
        val  emailText : EditText = findViewById(R.id.emailEditText)
        val  nameText : EditText = findViewById(R.id.nameEditText)
        val  ageText:EditText = findViewById(R.id.ageTextNumber)
        val intent = Intent(this@userinfo, MainActivity::class.java)
        if(emailText.text.isNotEmpty() && nameText.text.isNotEmpty() && ageText.text.isNotEmpty())
        {
            if (argument != null) {
                if(emailText.text.toString() != argument.get("email").toString()) intent.putExtra("email", "* ${emailText.text.toString()}")
                else intent.putExtra("email", emailText.text.toString())

                if(nameText.text.toString() != argument.get("name").toString()) intent.putExtra("name", "* ${nameText.text.toString()}")
                else intent.putExtra("name", nameText.text.toString())

                if(ageText.text.toString() != argument.get("age").toString()) intent.putExtra("age", "* ${ageText.text.toString()}")
                else intent.putExtra("age", ageText.text.toString())
                val bool:String = "true"
                intent.putExtra("second", bool.toString())
                startActivity(intent)
            }
        }
        else {
            val toast: Toast = Toast.makeText(applicationContext, "Поле пустое!", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}