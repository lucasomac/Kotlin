package br.digitial.com.aula05.exec05

import java.math.BigDecimal

fun main() {
    var concerssionaria = Concerssionaria("Discar")
    var carro = Veiculo("Honda", "City", 2019, "RED", 79000.0)
    var cliente = Cliente("Lucas", "Macedo", "79991615960")
    var venda = concerssionaria.registrarVenda(carro, cliente, BigDecimal.valueOf(26500))

    println("O carro vendido foi um ${venda.veiculo.marca} ${venda.veiculo.modelo} a ${venda.cliente.nome} ${venda.cliente.sobrenome} no valor de R$${venda.valorVenda}!")
}