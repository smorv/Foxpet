package com.example.fhran.foxpet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin.setOnClickListener(){
            val algo : Int = txtPassword.length()
            if(algo >= 8){
                Toast.makeText(this, "Hola ${txtUsername.text}", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "Password no es correcto!", Toast.LENGTH_LONG).show()

            }



        }

    }
}
