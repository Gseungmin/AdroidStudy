package com.example.test1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val items = mutableListOf<String>()
        items.add("노래1-1")
        items.add("노래1-2")
        items.add("노래1-3")

        val rv = view.findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(items)

        //어댑터 연결
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)


        view.findViewById<ImageView>(R.id.btn2).setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        view.findViewById<ImageView>(R.id.btn3).setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }
        return view
    }


}