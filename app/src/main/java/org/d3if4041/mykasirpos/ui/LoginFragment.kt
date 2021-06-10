package org.d3if4041.mykasirpos.ui

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import org.d3if4041.mykasirpos.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.buttonlogin.setOnClickListener {login()}

        return binding.root
    }

    private fun login(){
        val username = binding.unamelogin.text.toString()
        if (TextUtils.isEmpty(username)){
            Toast.makeText(context, "username salah", Toast.LENGTH_LONG).show()
            return
        }
        val password = binding.passlogin.text.toString()
        if (TextUtils.isEmpty(password)){
            Toast.makeText(context, "password salah", Toast.LENGTH_LONG).show()
            return
        }
    }

}