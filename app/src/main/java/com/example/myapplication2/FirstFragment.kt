@file:Suppress("DEPRECATION")

package com.example.myapplication2

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val toSecondButton = view.findViewById<Button>(R.id.buttonToSecondFragment)
        val toThirdButton = view.findViewById<Button>(R.id.buttonToThirdFragment)

        toSecondButton.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        toThirdButton.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }

        return view
    }
}
