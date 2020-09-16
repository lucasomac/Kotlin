package br.digitial.com.aula07

class RegistroRecebimentos {
    var recebimentos = mutableListOf<IRecebivel>()
    fun adicionarRecebimento(vararg r: IRecebivel) {
        recebimentos.addAll(r)
    }

    fun apresentarRecebimentos(vararg r: IRecebivel) =
        recebimentos.forEach {
            it.totalizarReceita()
            println(it.toString())
        }
}
