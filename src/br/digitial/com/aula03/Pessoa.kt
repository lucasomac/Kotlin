package br.digitial.com.aula03

class Pessoa(var name: String, var sobrenome: String, var idade: Int) {
    init {
        jantar()
    }

    fun jantar() {
        println("Pessoa $name está jantando")
    }

    fun passearComDog(cachorro: Cachorro) {
        println("Estou passeando com meu dog ${cachorro.name}")
    }
}