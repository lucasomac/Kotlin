package br.digitial.com.aula09

class Prova {
    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>) {
        println(conjuntoDeInteiros.reduce { count, number -> count + number })
    }
}