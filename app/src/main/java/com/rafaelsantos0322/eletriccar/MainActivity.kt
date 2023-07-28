package com.rafaelsantos0322.eletriccar

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rafaelsantos0322.eletriccar.adapter.CarAdapter
import com.rafaelsantos0322.eletriccar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var btnCalculo: Button
    lateinit var listaCarros: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        setupView()
        setupListiners()
        setupList()
    }
    fun  setupView(){
        btnCalculo = findViewById(R.id.btn_calcular)
        listaCarros = findViewById(R.id.rv_lista_carros)
    }
    fun setupList(){
        var dados = arrayOf(
            "Cupcake",
            "Donout",
            "Froyo",
            "Test01",
            "Test02",
            "Test03"
        )
        val adapter = CarAdapter(dados)
        listaCarros.layoutManager = LinearLayoutManager(this)
        listaCarros.adapter = adapter

    }



    fun setupListiners(){

        btnCalculo.setOnClickListener {

           startActivity(Intent(this, CalcularAutonomiaActivity::class.java))

        }
    }
}