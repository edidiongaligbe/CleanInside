package com.example.cleaninside.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.cleaninside.R
import com.example.cleaninside.databinding.FragmentQuantityBinding



class QuantityFragment : Fragment() {

    private lateinit var binding: FragmentQuantityBinding
    private lateinit var viewModel: QuantityViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {// Inflate view and obtain an instance of the binding class
        binding  = DataBindingUtil.inflate(inflater,R.layout.fragment_quantity, container, false)

        //Instantiate the view model
        viewModel = ViewModelProvider(this).get(QuantityViewModel::class.java)

        // Set the viewmodel for databinding - this allows the bound layout access to all the data in the VieWModel
        binding.quantity = viewModel

        //Setting the lifecycleOwner to be Fragment's View lifecycle, this ensures that the instance is destroyed when the fragment goes away
        binding.lifecycleOwner = viewLifecycleOwner

        //return the root view of the layout
        return binding.root
    }


}