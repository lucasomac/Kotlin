package br.digitial.com.aula05.ex02

class SessaoDeTreinamento(var experiencia: Int) {
    fun finalizarTreinamento() {
        this.experiencia++;
    }

    fun treinarA(jogador: JogadorDeFutebol) {
        println("Experiência Inicial do jogador ${jogador.nome} é: ${jogador.experiencia}");
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        jogador.experiencia++;
        println("Experiência Atual do jogador ${jogador.nome} é: ${jogador.experiencia}");
    }
}