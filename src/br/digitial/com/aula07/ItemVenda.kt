package br.digitial.com.aula07

class ItemVenda(var produto: String, var qtd: Int, val valor: Double) : IRecebivel {
    override fun totalizarReceita(): Double = valor * qtd

    override fun toString(): String =
        "Foi feita a venda do produto '$produto' com a quantidade de $qtd. O valor unitário é de R$$valor e o total a ser recebido é R$${totalizarReceita()}"
}