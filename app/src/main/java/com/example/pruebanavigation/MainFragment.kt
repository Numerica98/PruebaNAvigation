package com.example.pruebanavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //crateNavigateOnClickListener(xml a ir, paramentros)
        bt_go_a_count.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toAccount))

        bt_go_settings.setOnClickListener {
            it.findNavController().navigate(R.id.toSettings)
        }
    }


}
