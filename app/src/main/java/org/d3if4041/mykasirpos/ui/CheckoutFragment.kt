package org.d3if4041.mykasirpos.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if4041.mykasirpos.databinding.FragmentCheckoutBinding

class CheckoutFragment : Fragment() {

    private lateinit var binding: FragmentCheckoutBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCheckoutBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    private fun tambah(){

        binding.totalBarang.text
    }
}