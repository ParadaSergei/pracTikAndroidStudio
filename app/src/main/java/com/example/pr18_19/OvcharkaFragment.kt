package com.example.pr18_19

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.pr18_19.databinding.FragmentOvcharkaBinding

class OvcharkaFragment : Fragment() {
    private val dataModel:DataModel by activityViewModels()
    lateinit var binding: FragmentOvcharkaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentOvcharkaBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.messageForFragmentOvh.observe(activity as LifecycleOwner) {
            binding.tvMessage.text = it
        }


    }

    companion object {

        fun newInstance() = OvcharkaFragment().apply {}
    }
}