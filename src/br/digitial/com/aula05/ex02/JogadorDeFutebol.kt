package br.digitial.com.aula05.ex02

class JogadorDeFutebol(var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {
    fun fazerGol() {
        this.energia -= 5;
        this.alegria += 10;
        this.gols++;
        println("GOOOOL!")
    }

    fun correr() {
        this.energia -= 10;
        this.alegria += 10;
        this.gols++;
        println("Cansei!")
    }
}