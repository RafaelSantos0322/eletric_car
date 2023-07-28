package com.rafaelsantos0322.eletriccar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rafaelsantos0322.eletriccar.R

class CarAdapter(private val carros: Array<String>) :
    RecyclerView.Adapter<CarAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int = carros.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = carros[position]
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
       val textView: TextView = itemView.findViewById(R.id.tv_Valor_Preco)
    }

}