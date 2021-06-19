package org.d3if4041.mykasirpos.ui

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.d3if4041.mykasirpos.R
import org.d3if4041.mykasirpos.databinding.FragmentHomepageBinding

class HomeFragment : Fragment(){

    private lateinit var binding : FragmentHomepageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomepageBinding.inflate(layoutInflater, container, false)
        binding.buttonTambahBarang.setOnClickListener {
            findNavController().navigate(R.id.action_homepage_to_tambahFragment)
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.option_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.option_transaksi) {
            findNavController().navigate(
                R.id.action_homepage_to_fungsiContoh
            )
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}