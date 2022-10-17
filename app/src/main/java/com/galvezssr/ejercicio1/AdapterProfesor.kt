package com.galvezssr.ejercicio1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.galvezssr.ejercicio1.databinding.ProfesorBinding

class AdapterProfesor(private val lista: List<Profesor>, private val listener: (Profesor) -> Unit): RecyclerView.Adapter<AdapterProfesor.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        /* INFLAMOS LA VISTA Y DEVOLVEMOS UN VIEW */
        val view = LayoutInflater.from(parent.context).inflate(R.layout.profesor, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lista[position])

        holder.itemView.setOnClickListener {
            listener(lista[position])
        }
    }

    override fun getItemCount() = lista.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        /* RECIBIMOS LA VISTA INFLADA Y LA DESACOPLAMOS (OBTENEMOS TODAS LAS ETIQUETAS DE LA VISTA) */
        val binding = ProfesorBinding.bind(view)

        fun bind(profesor: Profesor) {
            binding.nombre.text = profesor.nombre
            Glide.with(binding.imagen).load(profesor.urlImg).into(binding.imagen)
            binding.telefono.text = profesor.telefono.toString()
            binding.email.text = profesor.email
        }
    }
}