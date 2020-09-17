package br.digitial.com.aula09

class GuardaVolumes(val guardaVolumes: MutableMap<Int, MutableList<Peca>>) {
    var contador = 0
    fun guardarPecas(listaDePeca: MutableList<Peca>): Int {
        guardaVolumes.put(contador, listaDePeca)
        return contador++
    }
}