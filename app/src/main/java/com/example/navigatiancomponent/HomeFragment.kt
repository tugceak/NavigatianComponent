package com.example.navigatiancomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.navigatiancomponent.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var mBining: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBining = FragmentHomeBinding.inflate(inflater,container,false)


        mBining.button.setOnClickListener { findNavController().navigate(R.id.toData) }
        return mBining.root
    }

}