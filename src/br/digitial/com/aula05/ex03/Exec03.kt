package br.digitial.com.aula05.ex03

fun main() {
    var atleta01 = Atleta("Yago Pikachu", 5, 69);
    var atleta02 = Atleta("Neto Borges", 2, 21);

    val seriaA = Prova(6, 60);
    val seriaB = Prova(5, 50);
    val seriaC = Prova(4, 40);
    val seriaD = Prova(3, 30);
    val seriaE = Prova(2, 20);
    val seriaF = Prova(1, 10);

    println(seriaA.podeRealizar(atleta01));
    println(seriaB.podeRealizar(atleta02));
    println(seriaC.podeRealizar(atleta01));
    println(seriaD.podeRealizar(atleta02));
    println(seriaE.podeRealizar(atleta01));
    println(seriaF.podeRealizar(atleta02));
}