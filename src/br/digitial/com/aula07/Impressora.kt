package br.digitial.com.aula07

class Impressora() {
    val listaImprimivel = mutableListOf<Imprimivel>();

    fun addImprimivel(vararg imprimivel: Imprimivel) {
        listaImprimivel.addAll(imprimivel)
    }

    fun imprimeTudo() = listaImprimivel.forEach { it.imprimir() }
}