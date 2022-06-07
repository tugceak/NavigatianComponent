package com.example.navigatiancomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigatiancomponent.databinding.FragmentDataBinding

class DataFragment : Fragment() {
    private lateinit var mBining:FragmentDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBining = FragmentDataBinding.inflate(inflater,container,false)

        mBining.button2.setOnClickListener { findNavController().navigate(R.id.toHome) }
        return mBining.root

    }


}