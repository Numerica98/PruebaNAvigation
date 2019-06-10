package com.example.pruebanavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_settings.*

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_pasarDatos.setOnClickListener {
            val nameBundle = Bundle()
            val compañiaBundle = Bundle()
            val estaturaBundle = Bundle()
            nameBundle.putString("nameIdol",ed_nombreIdol.text.toString())
            compañiaBundle.putString("compañiaIdol",ed_compañiaIdol.text.toString())
            estaturaBundle.putString("estaturaIdol",ed_estaturaIdol.text.toString())
            it.findNavController().navigate(R.id.toIdol,nameBundle)
        }
    }


}
