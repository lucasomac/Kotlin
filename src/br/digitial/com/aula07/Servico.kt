package br.digitial.com.aula07

class Servico(var descricao: String, var horas: Int, val precoHora: Double) : IRecebivel {
    override fun totalizarReceita(): Double = precoHora * horas

    override fun toString(): String =
        "Foi feito o serviço '$descricao' com a quantidade de horas $horas. O valor unitário da hora é de R$$precoHora e o total a ser recebido é R$${totalizarReceita()}"

}