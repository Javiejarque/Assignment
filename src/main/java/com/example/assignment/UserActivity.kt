package com.example.assignment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.assignment.databinding.NextFragmentBinding

class UserActivity : Fragment() {

    private lateinit var viewModel: NextViewModel
    private lateinit var binding: NextFragmentBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.next_fragment, container, false)
        viewModel = ViewModelProvider(this).get(NextViewModel::class.java)
        binding.viewmodel = viewModel
        viewModel.showResult.observe(viewLifecycleOwner, Observer {
            if (it) {
                updateScreen()
            }
        })
        return binding.root
    }


    fun updateScreen() {
        binding.invalidateAll()
    }

}