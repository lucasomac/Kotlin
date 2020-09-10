package br.digitial.com.aula06.santander

import java.math.BigDecimal
import java.util.*

class Corrente(saldo: BigDecimal, cliente: Cliente, var chequeEspecial: BigDecimal) : Conta(saldo, cliente) {

    override fun sacar(valor: BigDecimal) {
        when {
            this.saldo + chequeEspecial >= valor -> {
                this.saldo -= valor
                println("Saque de R$$valor realizado com sucesso!!")
            }
            else -> {
                println("Saldo insuficiente")
            }
        }
    }

    override fun consultarSaldo(): BigDecimal {
        return super.consultarSaldo() + chequeEspecial
    }

    fun depositarCheque(cheque: Cheque) {
        when {
            Date() >= cheque.dataPagamento -> {
                this.saldo += cheque.valor
            }
            else -> {
                println("Cheque fora do período de compenssação")
            }
        }
    }
}