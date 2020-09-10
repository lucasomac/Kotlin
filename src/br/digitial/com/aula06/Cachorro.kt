package br.digitial.com.aula06

class Cachorro(nomeAnimal: String) : Animal(nomeAnimal) {
    override fun andar() {
        println("Estou andando como um cachorro!")
    }

    override fun comer() {
        TODO("Not yet implemented")
    }
}