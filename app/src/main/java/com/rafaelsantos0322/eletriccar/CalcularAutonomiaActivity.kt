package com.rafaelsantos0322.eletriccar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalcularAutonomiaActivity : AppCompatActivity() {
    lateinit var preco : EditText
    lateinit var capacidadebateria: EditText
    lateinit var btnCalculo: Button
    lateinit var btnClose: ImageView
    lateinit var resultado: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupView()
        setupListiners()

    }
    fun  setupView(){
        preco = findViewById (R.id.et_preco_kWh) //recupera o valor digitado pelo usuario
        capacidadebateria = findViewById(R.id.et_capacidade_bateria)
        btnCalculo = findViewById(R.id.btn_calcular)
        btnClose = findViewById(R.id.iv_close)
        resultado = findViewById(R.id.tv_resultado)

    }

    fun setupListiners(){

        btnCalculo.setOnClickListener {
            calcular()

        }
        btnClose.setOnClickListener {
            finish()

        }


    }

    fun calcular() {
        var precoDigitado = preco.text.toString().toFloat()
        var capacidadeDigitada = capacidadebateria.text.toString().toFloat()
        var valorRecarga: Float = precoDigitado * capacidadeDigitada

        resultado.text =  ("Seu gasto por recarga completa é de  R$ $valorRecarga")


    }
}