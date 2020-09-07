package br.digitial.com.aula05.ex01

import java.math.BigDecimal

class Conta(val numero: Int, var saldo: BigDecimal, val titular: Cliente) {
    fun deposito(valor: BigDecimal) {
        this.saldo += valor
        println("O novo saldo é $saldo")
    }

    fun sacar(valor: BigDecimal) {
        when {
            saldo < valor -> {
                println("Saldo Insuficiente")
            }
            else -> {
                this.saldo -= valor
                println("Foi realizado um saque no valor de $valor e o novo saldo é $saldo")
            }
        }
    }
}