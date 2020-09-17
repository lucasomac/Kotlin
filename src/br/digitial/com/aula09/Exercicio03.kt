package br.digitial.com.aula09

fun main() {
    val numeros =
        mutableSetOf(1, 2, 3, 6, 2, 20, 89, 74, 18, 16556, 156156, 161561, 6165, 1929, 2929, 26323, 95, 62, 62)

    val prova = Prova()
    prova.somaTotal(numeros)
}