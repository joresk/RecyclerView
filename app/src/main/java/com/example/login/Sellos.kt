package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.login.adapter.ItemAdapter
import com.example.login.data.Datasource
import kotlinx.android.synthetic.main.activity_sellos.*

class Sellos : AppCompatActivity() {

    val misDatos = Datasource().loadSellos()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sellos)
        iniciarRecycler()
    }


    fun iniciarRecycler(){
        rvSellos.layoutManager = LinearLayoutManager(this)
        val adapter = ItemAdapter(misDatos)
        rvSellos.adapter = adapter
    }
}