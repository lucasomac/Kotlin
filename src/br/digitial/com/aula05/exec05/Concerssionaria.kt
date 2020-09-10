package br.digitial.com.aula05.exec05

import java.math.BigDecimal

class Concerssionaria(val nome: String) {
    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: BigDecimal): Venda {
        val venda = Venda(valor, cliente, veiculo);
        return venda;
    }
}