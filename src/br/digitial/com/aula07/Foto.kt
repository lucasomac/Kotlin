package br.digitial.com.aula07

class Foto(override var nome: String, override var tipoDocumento: String) : Imprimivel {
    override fun imprimir() {
        println("Eu sou uma selfie")
        super.imprimir()
    }

}