package com.example.login.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.login.R
import com.example.login.Sellos
import com.example.login.model.SellosConmemorativos
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_sellos.view.*

class ItemAdapter (val sellos:List<SellosConmemorativos>):
    RecyclerView.Adapter<ItemAdapter.SellosHolder>() {

    //Cada vez que se crea el ViewHolder (SellosHolder) dibuja en la pantalla con la lista de sellos
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SellosHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SellosHolder(layoutInflater.inflate(R.layout.list_sellos, parent, false))
    }

    //Holder es un objeto de SellosHolder que con el metodo render dibuja en la pantalla el item con la posición
    //seleccionada
    override fun onBindViewHolder(holder: SellosHolder, position: Int) {
        holder.render(sellos[position])
    }

    //funcion que devuelve cuantos items tiene de la sellos
    override fun getItemCount(): Int {
       return sellos.size
    }

    class SellosHolder(val view:View):RecyclerView.ViewHolder(view){

        fun render(sellos: SellosConmemorativos){
            view.txtNumero.text = sellos.number.toString()
            view.txtNombreSellos.text = sellos.name
            view.txtPrecio.text = sellos.price.toString()
            Picasso.get().load(sellos.image).into(view.imgSellos)
            }
    }
}