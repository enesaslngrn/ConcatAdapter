package com.example.concatadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.concatadapter.databinding.RecyclerItemRowBinding

class SecondRecyclerListAdapter(private val itemList : ArrayList<DataItem>) : RecyclerView.Adapter<SecondRecyclerListAdapter.SecondViewHolder>() {
    inner class SecondViewHolder(val binding : RecyclerItemRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int {
        return 1 // 1 Kere oluşturulmalı.
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SecondRecyclerListAdapter.SecondViewHolder {
        val binding = RecyclerItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SecondViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: SecondRecyclerListAdapter.SecondViewHolder,
        position: Int
    ) {
        holder.binding.recyclerView.apply {
            adapter = SecondRecyclerItemAdapter(itemList)
            layoutManager = GridLayoutManager(context,2, GridLayoutManager.HORIZONTAL,false)
        }
    }


}