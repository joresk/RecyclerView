package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bienvenido.*
import kotlinx.android.synthetic.main.activity_main.*

class BienvenidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)
        btnBack.setOnClickListener { onBackPressed() }
        showUser()
        btnSellos.setOnClickListener { pasarActivity() }
    }


    fun pasarActivity() {
        val intent1 = Intent(this, Sellos::class.java)
        startActivity(intent1)
    }

    fun showUser(){
        val bundle = intent.extras
        val name = bundle?.get("INTENT_LOGIN")
        txtUserWelcome.text = "$name"

    }
}