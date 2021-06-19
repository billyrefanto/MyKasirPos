package org.d3if4041.mykasirpos.ui

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import org.d3if4041.mykasirpos.R
import org.d3if4041.mykasirpos.databinding.FragmentPembayaranBinding

class PembayaranFragment : Fragment() {

    private lateinit var binding: FragmentPembayaranBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentPembayaranBinding.inflate(layoutInflater, container, false)
        binding.buttonLimaRibu.setOnClickListener {
            binding.uangEdit.setText(R.string.lima_ribu)
        }
        binding.buttonSepuluhRibu.setOnClickListener {
            binding.uangEdit.setText(R.string.sepuluh_ribu)
        }
        binding.buttonDuaPuluh.setOnClickListener {
            binding.uangEdit.setText(R.string.dua_puluh)
        }
        binding.buttonLimaPuluh.setOnClickListener {
            binding.uangEdit.setText(R.string.lima_puluh)
        }
        binding.buttonSeratus.setOnClickListener {
            binding.buttonSeratus.setText(R.string.seratus_ribu)
        }

        binding.buttonBayar.setOnClickListener { bayar() }

        return binding.root
    }

    private fun bayar(){
        val uang = binding.uangEdit.text.toString()
        if(TextUtils.isEmpty(uang)){
            Toast.makeText(context, "input invalid", Toast.LENGTH_LONG).show()
            return
        }
    }

}