package com.example.listusers.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listusers.data.User
import com.example.listusers.databinding.CardLayoutBinding

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var listUser = emptyList<User>()

    class UserViewHolder(val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            CardLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = listUser[position]

        holder.binding.textId.text = user.id.toString()
        holder.binding.textName.text = user.nome
        holder.binding.textSurname.text = user.sobrenome
        holder.binding.textAge.text = user.idade.toString()
    }

    override fun getItemCount(): Int {
        return listUser.size
    }

    fun setList(list: List<User>) {
        listUser = list
        notifyDataSetChanged()
    }
}