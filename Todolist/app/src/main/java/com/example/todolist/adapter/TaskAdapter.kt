package com.example.todolist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.CardLayoutBinding
import com.example.todolist.model.Task

class TaskAdapter : RecyclerView.Adapter<TaskAdapter.TaskViewHolder> () {

    private var listTask = emptyList<Task>()

    class TaskViewHolder(val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = listTask[position]

        holder.binding.textName.text = task.nome
        holder.binding.textdescription.text = task.descricao
        holder.binding.textresponsible.text = task.responsavel
        holder.binding.textdescription.text = task.data
        holder.binding.textProgress.isChecked= task.status
        holder.binding.textCategoria.text = task.categoria.description

    }

    override fun getItemCount(): Int {
        return listTask.size
    }

    fun setlist (list: List<Task>){
        listTask = list

        notifyDataSetChanged()
    }
}