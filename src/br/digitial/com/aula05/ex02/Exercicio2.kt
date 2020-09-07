package br.digitial.com.aula05.ex02

import br.digitial.com.aula05.ex02.JogadorDeFutebol
import br.digitial.com.aula05.ex02.SessaoDeTreinamento

fun main() {
    var n14: JogadorDeFutebol;
    var n08: JogadorDeFutebol;
    n14 = JogadorDeFutebol("German Cano", 89, 56, 16, 79);
    n08 = JogadorDeFutebol("Felipe Bastos", 77, 96, 11, 57);

    var sessao01 = SessaoDeTreinamento(0);
    sessao01.treinarA(n14);
    sessao01.treinarA(n08);
}