package com.example.cuentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class TaleFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tale, container, false)
        val mensaje = TaleFragmentArgs.fromBundle(requireArguments()).protagonist
        val nombre = view.findViewById<TextView>(R.id.name)
        nombre.text = mensaje

        return view
    }

}