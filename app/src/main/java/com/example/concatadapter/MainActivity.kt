package com.example.concatadapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.concatadapter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val firstAdapter by lazy { FirstRecyclerListAdapter(getItems()) }
    private val firstHeaderAdapter by lazy { HeaderAdapter("First Header") }
    private val firstFooterAdapter by lazy {HeaderAdapter("First Footer")}
    private val secondAdapter by lazy { SecondRecyclerListAdapter(getItems()) }
    private val secondHeaderAdapter by lazy { HeaderAdapter("Second Header") }
    private val dummyAdapter1 by lazy { FirstRecyclerListAdapter(getItems()) }
    private val dummyHeaderAdapter1 by lazy { HeaderAdapter("Dummy Header") }
    private val dummyAdapter2 by lazy { FirstRecyclerListAdapter(getItems()) }
    private val dummyHeaderAdapter2 by lazy { HeaderAdapter("Dummy Header2") }
    private val dummyAdapter3 by lazy { SecondRecyclerListAdapter(getItems()) }
    private val dummyHeaderAdapter3 by lazy { HeaderAdapter("Dummy Header3") }

    private var concatAdapter = ConcatAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Concat Adapter -> Önemli!!

        concatAdapter = ConcatAdapter(
            // SIRA ÖNEMLİ
            firstHeaderAdapter,
            firstAdapter,
            firstFooterAdapter,
            secondHeaderAdapter,
            secondAdapter,
            dummyHeaderAdapter1,
            dummyAdapter1,
            dummyHeaderAdapter2,
            dummyAdapter2,
            dummyHeaderAdapter3,
            dummyAdapter3
        )

        binding.recyclerView.apply {
            adapter = concatAdapter
            layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
        }

    }

    private fun getItems() : ArrayList<DataItem>{
        // Dummy data
        return arrayListOf(
            DataItem(1,"Item 1"),
            DataItem(2,"Item 2"),
            DataItem(3,"Item 3"),
            DataItem(4,"Item 4"),
            DataItem(5,"Item 5"),
            DataItem(1,"Item 1"),
            DataItem(2,"Item 2"),
            DataItem(3,"Item 3"),
            DataItem(4,"Item 4"),
            DataItem(5,"Item 5"),
            DataItem(1,"Item 1"),
            DataItem(2,"Item 2"),
            DataItem(3,"Item 3"),
            DataItem(4,"Item 4"),
            DataItem(5,"Item 5"),
            DataItem(1,"Item 1"),
            DataItem(2,"Item 2"),
            DataItem(3,"Item 3"),
            DataItem(4,"Item 4"),
            DataItem(5,"Item 5"),
        )
    }
}