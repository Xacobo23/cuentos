package com.example.cuentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class NameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_name, container, false)
        val btnNext = view.findViewById<Button>(R.id.btn_Text)
        btnNext.setOnClickListener{
            view.findNavController()
                .navigate(NameFragmentDirections
                .actionNameFragmentToChooseFragment(
                    view.findViewById<EditText>(R.id.nameP).text.toString()
                ))
        }
        return view
    }

}