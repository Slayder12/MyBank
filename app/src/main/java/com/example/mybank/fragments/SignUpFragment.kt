package com.example.mybank.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.mybank.R

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nameTextTV = view.findViewById<EditText>(R.id.userNameET)
        val passwordET = view.findViewById<EditText>(R.id.passwordET)
        val loginSignUpBTN = view.findViewById<Button>(R.id.loginSignUpBTN)

        loginSignUpBTN.setOnClickListener{

            val userNameSignUp = nameTextTV.text.toString()
            val userPasswordET = passwordET.text.toString()

            if (userNameSignUp.isEmpty() || userPasswordET.isEmpty()){
                Toast.makeText(context, "Данные не введены", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val bundle = Bundle()
            val signInFragment = SignInFragment()
            bundle.putString("name", userNameSignUp)
            bundle.putString("password", userPasswordET)
            signInFragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.containerID, signInFragment)?.commit()
            Toast.makeText(context, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show()
        }


    }

}