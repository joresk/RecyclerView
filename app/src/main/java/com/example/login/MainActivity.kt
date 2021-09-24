package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin.setOnClickListener{checkLogin()}

    }
    //logica de Login
    fun checkLogin(){
        var usuario = "Nacho"
        var contraseña = "nacho123"
        var user1 = edtUser.text.toString()
        var pwd1 = edtPassword.text.toString()
        if(edtUser.text.isNotEmpty() && edtPassword.text.isNotEmpty()){
            //Pasar a la otra Activity
                if (user1.equals(usuario) && pwd1.equals(contraseña)){
                    val intent = Intent(this, BienvenidoActivity::class.java)
                    intent.putExtra("INTENT_LOGIN", edtUser.text)
                    startActivity(intent)
                }else{
                    Toast.makeText(this,"Los datos son incorrectos...",Toast.LENGTH_LONG).show()

                }

        }else{
            Toast.makeText(this, "Revise sus datos de inicio...", Toast.LENGTH_SHORT).show()
        }
    }
}