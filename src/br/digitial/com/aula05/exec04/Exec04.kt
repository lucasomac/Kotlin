package br.digitial.com.aula05.exec04

fun main() {
    val tripe = Tripe(true, 1.70, 0.70, 1.32)
    tripe.dobrar()
    tripe.definirAltura(1.20)
    tripe.desdobrar()
    println("Pronto para guardar: ${tripe.prontoParaGuardar()}")
    tripe.guardar()
    println("Pronto para usar? ${tripe.prontoParaUsar()}")
    tripe.usar()

}