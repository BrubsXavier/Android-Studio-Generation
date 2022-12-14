package com.example.todolist

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.todolist.databinding.FragmentFormBinding
import com.example.todolist.databinding.FragmentListBinding
import com.example.todolist.model.Category
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FormFragment : Fragment() {

    private lateinit var binding: FragmentFormBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormBinding.inflate(layoutInflater, container, false)

        mainViewModel.listCategory()

        mainViewModel.myCategoryResponse.observe(viewLifecycleOwner) {
           response -> Log.d("Requisicao", response.body().toString())
            spinnerCategory(response.body())
        }

        binding.saveButton.setOnClickListener {
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        }

        return binding.root
    }

    fun spinnerCategory(listCategory: List<Category>?) {
        if (listCategory != null) {
            binding.spinnerCategoria.adapter =
                ArrayAdapter(
                    requireContext(),
                    androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                    listCategory
                )
        }
    }

}