package br.digitial.com.aula07

class Documento(override var nome: String, override var tipoDocumento: String) : Imprimivel {
    override fun imprimir() {
        println("Eu sou um documento")
        super.imprimir()
    }
}