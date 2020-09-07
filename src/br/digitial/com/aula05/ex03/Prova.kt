package br.digitial.com.aula05.ex03

class Prova(val dificuldade: Int, val energiaNecessaria: Int) {
    fun podeRealizar(atleta: Atleta): Boolean = atleta.energia >= this.energiaNecessaria && atleta.nivel >= this.dificuldade;
}