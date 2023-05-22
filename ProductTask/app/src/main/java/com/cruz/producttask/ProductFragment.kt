package com.cruz.producttask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ProductFragment : Fragment() {
    private lateinit var actionNavToCreateProduct: FloatingActionButton
    private lateinit var cardViewsProduct1: CardView
    private lateinit var cardViewsProduct2: CardView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        actionNavToCreateProduct = view.findViewById(R.id.action_to_create_movie)
        cardViewsProduct1 = view.findViewById(R.id.cardView_star_wars)
        cardViewsProduct2 = view.findViewById(R.id.cardView_harry_potter)

        cardViewsProduct1.setOnClickListener {
            it.findNavController().navigate(R.id.action_productFragment_to_listFragment)
        }

        cardViewsProduct2.setOnClickListener {
            it.findNavController().navigate(R.id.action_productFragment_to_listFragment)
        }

        actionNavToCreateProduct.setOnClickListener {
            it.findNavController().navigate(R.id.action_productFragment_to_createFragment)
        }
    }



}