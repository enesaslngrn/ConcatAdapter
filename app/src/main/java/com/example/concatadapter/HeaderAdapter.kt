package com.example.concatadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.concatadapter.databinding.HeaderRowBinding

class HeaderAdapter(private val headerText : String) : RecyclerView.Adapter<HeaderAdapter.HeaderViewHolder>() {
    inner class HeaderViewHolder(val binding : HeaderRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int {
        return 1 // String tipinde 1 adet başlık göndericem.
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HeaderAdapter.HeaderViewHolder {
        val binding = HeaderRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return HeaderViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HeaderAdapter.HeaderViewHolder, position: Int) {
        holder.binding.tvHeader.text = headerText
    }
}