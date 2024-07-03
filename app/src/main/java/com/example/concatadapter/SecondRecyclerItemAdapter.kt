package com.example.concatadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.concatadapter.databinding.Item2RowBinding
import com.example.concatadapter.databinding.ItemRowBinding

class SecondRecyclerItemAdapter(private val itemList : ArrayList<DataItem>) : RecyclerView.Adapter<SecondRecyclerItemAdapter.SecondViewHolder>() {
    inner class SecondViewHolder (val binding: Item2RowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val binding = Item2RowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SecondViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.binding.tvItem.text = currentItem.text
    }

}