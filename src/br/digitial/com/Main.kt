package br.digitial.com

import br.digitial.com.santander.Cliente
import br.digitial.com.santander.Conta

fun main() {
    val c1 = Cliente("Lucas", "Macedo")
    val c2 = Cliente("Mateus", "Macedo")

    var ct1 = Conta(1, 0.0, c1)
    var ct2 = Conta(1, 0.0, c2)
}