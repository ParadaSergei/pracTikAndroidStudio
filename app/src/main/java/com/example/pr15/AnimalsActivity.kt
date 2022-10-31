package com.example.pr15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.TextView

class AnimalsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animals)
        val textView: TextView = findViewById(R.id.textView)
        var user = User()
        val arguments: Bundle? = intent.extras
        if (arguments != null) {
            user = arguments.getParcelable<User>(user.javaClass.simpleName) as User
            textView.text = "Месяц рождения: ${user.getMonth()}\n" +
                        "Год рождения: ${user.getYear()}\nПорода: ${user.getBreed()}"
        }
    }
    class User() : Parcelable {
        private var poroda: String = ""
        private var year: String = ""
        private var month: String = ""
        constructor(parcel: Parcel) : this() {
            poroda = parcel.readString().toString()
            year = parcel.readString().toString()
            month = parcel.readString().toString()
        }
        companion object CREATOR : Parcelable.Creator<User> {
            override fun createFromParcel(parcel: Parcel): User {
                return User(parcel)
            }
            override fun newArray(size: Int): Array<User?> {
                return arrayOfNulls(size)
            }
        }
        constructor(_breed: String, _year: String, _month: String) : this() {
            poroda = _breed
            year = _year
            month = _month
        }
        fun setBreed(_breed: String) {
            poroda = _breed
        }
        fun getBreed(): String {
            return poroda
        }
        fun setYear(_year: String) {
            year = _year
        }
        fun getYear(): String {
            return year
        }
        fun setMonth(_month: String) {
            month = _month
        }
        fun getMonth(): String {
            return month
        }
        override fun describeContents(): Int {
            return 0
        }
        override fun writeToParcel(dest: Parcel?, flags: Int) {
            dest?.writeString(poroda)
            dest?.writeString(year)
            dest?.writeString(month)
        }
    }
}