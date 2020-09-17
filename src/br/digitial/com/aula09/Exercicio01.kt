package br.digitial.com.aula09

fun main() {
    val loteria = mapOf(0 to "Ovos", 1 to "Água", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo")
    val apelidoJoao = listOf("Juan", "Fissura", "MarombaMiguel")
    val apelidoMiguel = listOf("Night Watch", "Bruce Wayne", "Tampinha")
    val apelidoMaria = listOf("Wonder Woman", "Mary", "Marilene")
    val apelidoLucas = listOf("Lukinha", "Jorge", "George")

    val apelidos =
        mapOf("João" to apelidoJoao, "Miguel" to apelidoMiguel, "Maria" to apelidoMaria, "Lucas" to apelidoLucas)
    apelidos.forEach { println(it) }

}