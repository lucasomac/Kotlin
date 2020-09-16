package br.digitial.com.aula07

interface Imprimivel {
    var nome: String
    var tipoDocumento: String

    fun imprimir() = println("$nome.$tipoDocumento")
}