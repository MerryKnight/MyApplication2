@file:Suppress("DEPRECATION")

package com.example.myapplication2
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val toFirstButton = view.findViewById<Button>(R.id.toFirstFragment)
        val toSecondButton = view.findViewById<Button>(R.id.toSecondFragment)

        toFirstButton.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
        }

        toSecondButton.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)
        }

        return view
    }
}
