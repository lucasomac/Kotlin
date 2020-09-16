package br.digitial.com.aula07

class Contrato(override var nome: String, override var tipoDocumento: String) : Imprimivel {
    override fun imprimir() {
        println("Sou um contrato muito legal")
        super.imprimir()
    }
}