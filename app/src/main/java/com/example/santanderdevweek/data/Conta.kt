package com.example.santanderdevweek.data

data class Conta(
    val numero: String,
    val agencia: String,
    val saldo: String,
    val limite: String,
    val cliente: Cliente,
    val cartao: Cartao
)