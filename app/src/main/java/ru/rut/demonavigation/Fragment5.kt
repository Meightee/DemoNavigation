package ru.rut.demonavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class Fragment5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment5, container, false)
        val button = view.findViewById<Button>(R.id.button8)
        button.setOnClickListener {
            findNavController().navigate(
                R.id.action_fragment5_to_fragment6,
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val button = view.findViewById<Button>(R.id.button9)
        button.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}