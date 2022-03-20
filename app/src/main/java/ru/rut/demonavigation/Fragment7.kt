package ru.rut.demonavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class Fragment7 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment7, container, false)
        val button = view.findViewById<Button>(R.id.button12)
        button.setOnClickListener {
            findNavController().navigate(
                R.id.action_fragment7_to_fragment8,
                null,
                navOptions {
                    anim {
                        enter = R.anim.slide_in
                        exit = R.anim.fade_out
                    }
                }
            )
        }
        val button2 = view.findViewById<Button>(R.id.button13)
        button2.setOnClickListener {
            findNavController().navigate(
                R.id.action_fragment7_to_fragment9,
                null,
                navOptions {
                    anim {
                        enter = R.anim.slide_in
                        exit = R.anim.fade_out
                    }
                }
            )
        }
        val button3 = view.findViewById<Button>(R.id.button14)
        button3.setOnClickListener {
            findNavController().navigate(
                R.id.action_fragment7_to_fragment10,
                null,
                navOptions {
                    anim {
                        enter = R.anim.slide_in
                        exit = R.anim.fade_out
                    }
                }
            )
        }
        return view
    }
}