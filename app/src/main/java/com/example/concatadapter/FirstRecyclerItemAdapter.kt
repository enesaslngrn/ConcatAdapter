package com.example.concatadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.concatadapter.databinding.ItemRowBinding

class FirstRecyclerItemAdapter(private val itemList : ArrayList<DataItem>) : RecyclerView.Adapter<FirstRecyclerItemAdapter.FirstViewHolder>() {
    inner class FirstViewHolder(val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int {
        return itemList.size
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FirstRecyclerItemAdapter.FirstViewHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FirstViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FirstRecyclerItemAdapter.FirstViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.binding.tvItem.text = currentItem.text
    }
}