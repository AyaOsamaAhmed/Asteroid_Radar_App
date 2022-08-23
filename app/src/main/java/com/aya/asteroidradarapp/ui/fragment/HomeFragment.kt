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
import com.aya.asteroidradarapp.databinding.HomeFragmentBinding
import com.aya.asteroidradarapp.domain.model.DetectedModel
import com.aya.asteroidradarapp.domain.response.MainResponse
import com.aya.asteroidradarapp.ui.activity.MainActivity
import com.aya.asteroidradarapp.ui.adapter.NewsAdapter
import com.aya.asteroidradarapp.ui.interfaces.onClickDetails
import com.aya.asteroidradarapp.ui.viewModel.HomeViewModel
import java.text.SimpleDateFormat
import java.util.*


class HomeFragment : Fragment() , onClickDetails {

    private lateinit var binding : HomeFragmentBinding
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
        binding = HomeFragmentBinding.inflate(inflater , container , false)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)



        viewModel.requestDataLiveData.observe(viewLifecycleOwner, Observer {
            val data = it as MainResponse
            binding.url = data.url
            binding.title.text = data.title
            val calendar = Calendar.getInstance()
            val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
            sdf.parse(data.date)

          //  viewModel.feedData(data.date,date.time)
          //  adapter = NewsAdapter(this)
         //   adapter.submitList(data.articles)
          //  binding.recyclerNews.adapter = adapter
        })


        return binding.root
    }

    override fun onClick(artical: DetectedModel) {
        TODO("Not yet implemented")
    }

}