package org.d3if4041.mykasirpos.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if4041.mykasirpos.R
import org.d3if4041.mykasirpos.databinding.FragmentPembayaranBinding

class PembayaranFragment : Fragment() {

    private lateinit var binding: FragmentPembayaranBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentPembayaranBinding.inflate(layoutInflater, container, false)
        binding.buttonLimaRibu.setOnClickListener {
            val uang = binding.uangEdit.text.toString()
            val total = uang.toInt() + 5000
            binding.uangEdit.setText(getString(R.string.total_bayar, total))
        }
        binding.buttonSepuluhRibu.setOnClickListener {
            val uang = binding.uangEdit.text.toString()
            val total = uang.toInt() + 10000
            binding.uangEdit.setText(getString(R.string.total_bayar, total))
        }
        binding.buttonDuaPuluh.setOnClickListener {
            val uang = binding.uangEdit.text.toString()
            val total = uang.toInt() + 20000
            binding.uangEdit.setText(getString(R.string.total_bayar, total))
        }

        return binding.root
    }

}