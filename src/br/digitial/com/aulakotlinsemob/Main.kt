package br.digitial.com.aulakotlinsemob

fun main() {
    print(bascara(5.0, 3.0, 4.0));
}

fun bascara(a: Double, b: Double, c: Double) {
    val delta = Math.pow(b, 2.0) - 4 * a * c;
    if (delta > 0) {
        println(-b + Math.sqrt(delta) / 2 * a);
        println(-b - Math.sqrt(delta) / 2 * a);
    } else {
        if (delta == 0.0) {
            println(-b + Math.sqrt(delta) / 2 * a);
        } else {
            println("Não possui raiz");
        }
    }
}

fun nomeCompleto(nome: String, sobrenome: String): String {
    return nome + sobrenome;
}