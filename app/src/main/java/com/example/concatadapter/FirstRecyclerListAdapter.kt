package com.example.concatadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.concatadapter.databinding.RecyclerItemRowBinding

class FirstRecyclerListAdapter(private val itemList : ArrayList<DataItem>) : RecyclerView.Adapter<FirstRecyclerListAdapter.FirstViewHolder>(){
    inner class FirstViewHolder (val binding : RecyclerItemRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int {
        return 1// 1 Kere oluşturulmalı.
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FirstRecyclerListAdapter.FirstViewHolder {
        val binding = RecyclerItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FirstViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FirstRecyclerListAdapter.FirstViewHolder, position: Int) {
        holder.binding.recyclerView.apply {
            adapter = FirstRecyclerItemAdapter(itemList)
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        }
    }


}