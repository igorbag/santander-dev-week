package com.br.dio.santanderdevweek.data.local

import com.br.dio.santanderdevweek.data.Cartao
import com.br.dio.santanderdevweek.data.Cliente
import com.br.dio.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Igor")
        val cartao = Cartao("411111111")
        return Conta(
            "445655-4",
            "6552-4",
            "R$ 2.450,80",
            "R$ 4.120,00",
            cliente,
            cartao
        );
    }
}