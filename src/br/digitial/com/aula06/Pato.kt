package br.digitial.com.aula06

class Pato(nomeAnimal: String) : Animal(nomeAnimal) {
    override fun andar() {
        println("Estou andando como um Pato!")
    }

    override fun comer() {
        TODO("Not yet implemented")
    }
}