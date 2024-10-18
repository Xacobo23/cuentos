package com.example.cuentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class ChooseFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_choose, container, false)

        val message = ChooseFragmentArgs.fromBundle(requireArguments()).name
        //view.findNavController()
          //  .navigate(ChooseFragmentDirections.actionChooseFragmentToTaleFragment(message))

        val cardHouse = view.findViewById<CardView>(R.id.cardHouse)
        cardHouse.setOnClickListener{
            view.findNavController().navigate(ChooseFragmentDirections.actionChooseFragmentToTaleFragment(message))
        }

        println("$message ksgfhjken")

        return view
    }


}