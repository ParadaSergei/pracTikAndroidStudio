package com.example.pr18_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.example.pr18_19.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    private val dataModel:DataModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       openFrag(OvcharkaFragment.newInstance() ,R.id.fragment_infa)
        openFrag(ButtonFragment.newInstance(),R.id.fragment_button)

    }
    private fun openFrag(f:Fragment,idHolder:Int){
        supportFragmentManager.beginTransaction().replace(idHolder,f).commit()}
}






