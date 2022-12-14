package com.aya.asteroidradarapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.aya.asteroidradarapp.R
import com.aya.asteroidradarapp.databinding.DetailsFragmentBinding
import com.aya.asteroidradarapp.databinding.HomeFragmentBinding
import com.aya.asteroidradarapp.domain.model.DetectedModel
import com.aya.asteroidradarapp.domain.response.MainResponse
import com.aya.asteroidradarapp.ui.activity.MainActivity
import com.aya.asteroidradarapp.ui.adapter.NewsAdapter
import com.aya.asteroidradarapp.ui.interfaces.onClickDetails
import com.aya.asteroidradarapp.ui.viewModel.HomeViewModel


class DetailsFragment : Fragment() {

    private lateinit var binding : DetailsFragmentBinding
    private lateinit var viewModel : HomeViewModel
    private lateinit var adapter : NewsAdapter

    val mainActivity  by lazy { activity as MainActivity }

    private val navController by lazy {
        val navHostFragment = activity?.supportFragmentManager
            ?.findFragmentById(R.id.homeframelayout) as NavHostFragment
        navHostFragment.navController
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DetailsFragmentBinding.inflate(inflater , container , false)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)




        return binding.root
    }


}