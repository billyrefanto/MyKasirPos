package org.d3if4041.mykasirpos.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.d3if4041.mykasirpos.databinding.FragmentTambahBinding

class TambahFragment : Fragment() {

    private lateinit var binding : FragmentTambahBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTambahBinding.inflate(layoutInflater, container, false)
        

        return binding.root
    }
}