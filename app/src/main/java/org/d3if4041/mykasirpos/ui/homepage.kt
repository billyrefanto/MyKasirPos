package org.d3if4041.mykasirpos.ui

import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.d3if4041.mykasirpos.R

class homepage : Fragment(){

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