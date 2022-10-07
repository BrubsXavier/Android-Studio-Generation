package com.example.listusers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.listusers.data.User
import com.example.listusers.databinding.FragmentAddBinding
import com.example.listusers.databinding.FragmentListBinding


class AddFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentAddBinding.inflate(layoutInflater, container, false)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.addButton.setOnClickListener {
            inserirNoBanco()
        }


        return binding.root
    }


    fun verificarCampos(nome: String, sobrenome: String, idade: String): Boolean {

        return !(nome == "" || sobrenome == "" || idade == "")
    }

    fun inserirNoBanco() {
        val nome = binding.editNome.text.toString()
        val sobrenome = binding.editSobrenome.text.toString()
        val idade = binding.editIdade.text.toString()

        if (verificarCampos(nome, sobrenome, idade)) {
            val user = User(0, nome, sobrenome, idade.toInt())
            mainViewModel.addUser(user)
            Toast.makeText(context, "Usuário adicionado!!!", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_addFragment3_to_listFragment3)
        } else {
            Toast.makeText(context, "Preencha os campos corretamente!!!", Toast.LENGTH_LONG).show()
        }
    }
}