@file:Suppress("DEPRECATION")

package com.example.myapplication2
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val toFirstButton = view.findViewById<Button>(R.id.toFirstFragment)
        val toThirdButton = view.findViewById<Button>(R.id.toThirdFragment)

        toFirstButton.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }

        toThirdButton.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        return view
    }
}