package com.example.assignment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import com.example.assignment.databinding.WelcomeFragmentBinding

class Welcome : Fragment() {

    private lateinit var viewModel: WelcomeViewModel
    private lateinit var binding: WelcomeFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.welcome_fragment, container, false)
        viewModel = ViewModelProvider(this).get(WelcomeViewModel::class.java)
        binding.viewmodel = viewModel

        viewModel.navigateToNextFragment.observe(viewLifecycleOwner, Observer {
            if (it) {
                navigateToNextFragment()
            }
        })
        return binding.root
    }

    fun navigateToNextFragment() {
        requireView().findNavController().navigate(R.id.action_welcomeFragment_to_nextFragment)
        viewModel.navigationFinished()
    }

}