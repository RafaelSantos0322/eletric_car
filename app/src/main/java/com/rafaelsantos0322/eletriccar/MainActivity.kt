package com.rafaelsantos0322.eletriccar

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var btnCalculo: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListiners()
    }
    fun  setupView(){
        btnCalculo = findViewById(R.id.btn_calcular)
    }

    fun setupListiners(){

        btnCalculo.setOnClickListener {

           startActivity(Intent(this, CalcularAutonomiaActivity::class.java))

        }
    }
}