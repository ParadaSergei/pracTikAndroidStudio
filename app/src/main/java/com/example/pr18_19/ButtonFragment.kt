package com.example.pr18_19

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.pr18_19.databinding.FragmentButtonBinding


class ButtonFragment : Fragment() {
    private val dataModel:DataModel by activityViewModels()
    lateinit var binding:FragmentButtonBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentButtonBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }


    companion object {

        fun newInstance() = ButtonFragment().apply {}
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
binding.imageButton.setOnClickListener(){
    dataModel.messageForFragmentOvh.value= "Английский мастиф – настоящий герой сказок о мирных великанах!\n" +
            "В противовес грозному и внушительному виду\n" +
            "эта собака отличается мягким и добродушным нравом."
}
        binding.imageButton2.setOnClickListener(){
            dataModel.messageForFragmentOvh.value="Кавказская овчарка или кавказский волкодав – порода\n" +
                    "крупных сторожевых собак с решительным, бесстрашным характером.\n" +
                    "Отлично справляются с пастушеской и охранной деятельностью.\n" +
                    "Преданы одному хозяину."
        }
    }
}