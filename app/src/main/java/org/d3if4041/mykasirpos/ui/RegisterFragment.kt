package org.d3if4041.mykasirpos.ui

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import org.d3if4041.mykasirpos.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        binding.btnReg.setOnClickListener {}
        return binding.root
    }

    private fun register(){
        val nama = binding.editNama.text.toString()
        if (TextUtils.isEmpty(nama)) {
            Toast.makeText(context, "input nama invalid", Toast.LENGTH_LONG).show()
            return
        }
        val email = binding.editEmail.text.toString()
        if (TextUtils.isEmpty(email)){
            Toast.makeText(context, "input email invalid", Toast.LENGTH_LONG).show()
            return
        }
        val username = binding.editUsername.text.toString()
        if (TextUtils.isEmpty(username)){
            Toast.makeText(context, "input username invalid", Toast.LENGTH_LONG).show()
            return
        }
        val password = binding.editPassword.text.toString()
        if (TextUtils.isEmpty(password)){
            Toast.makeText(context, "input password invalid", Toast.LENGTH_LONG).show()
            return
        }
        val toko = binding.editNamaToko.text.toString()
        if (TextUtils.isEmpty(toko)){
            Toast.makeText(context, "input toko invalid", Toast.LENGTH_LONG).show()
            return
        }
        val noTelp = binding.editTlp.text.toString()
        if (TextUtils.isEmpty(noTelp)){
            Toast.makeText(context, "input no telepon invalid", Toast.LENGTH_LONG).show()
            return
        }
        val alamat = binding.editAlamat.text.toString()
        if (TextUtils.isEmpty(alamat)){
            Toast.makeText(context, "input alamat invalid", Toast.LENGTH_LONG).show()
            return
        }
    }

}