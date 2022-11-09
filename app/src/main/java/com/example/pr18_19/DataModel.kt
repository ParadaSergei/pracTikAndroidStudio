package com.example.pr18_19

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel : ViewModel(){
    val messageForFragmentOvh:MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val messageForFragmentButtonFragment:MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val messageForActivity:MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
}