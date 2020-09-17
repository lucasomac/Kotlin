package br.digitial.com.aula09

fun main(){
    val lista = mutableListOf<Int>()
    lista.addAll(listOf(1,5,5,6,7,8,8,8))
    println(lista)

    val conjunto = mutableSetOf<Int>()
    conjunto.addAll(listOf(1,5,5,6,7,8,8,8))
    println(conjunto)
}
