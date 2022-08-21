package com.aya.asteroidradarapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aya.asteroidradarapp.BR
import com.aya.asteroidradarapp.databinding.NewsItemBinding
import com.aya.asteroidradarapp.ui.interfaces.onClickDetails
import com.aya.asteroidradarapp.domain.model.DetectedModel

class NewsAdapter(val onClick : onClickDetails)  :  ListAdapter<DetectedModel, NewsAdapter.ViewHolder>(ArticlesModelDiffCallback()){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = NewsItemBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     val item = getItem(position)




    }

    class ArticlesModelDiffCallback :
        DiffUtil.ItemCallback<DetectedModel>() {
        override fun areItemsTheSame(oldItem: DetectedModel, newItem: DetectedModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: DetectedModel, newItem: DetectedModel): Boolean {
                return oldItem == newItem
        }
    }

    class ViewHolder(binding: NewsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var itemRowBinding: NewsItemBinding = binding
        fun bind(obj: Any?) {
            itemRowBinding.setVariable(BR.model, obj)
            itemRowBinding.executePendingBindings()
        }
    }
}