package br.digitial.com.aula07;

public class Main {
    public static void main(String[] args) {
        ItemVenda venda1 = new ItemVenda("Adesivo", 30, 99.12);
        ItemVenda venda2 = new ItemVenda("Machado", 17, 56);
        ItemVenda venda3 = new ItemVenda("Fone", 321, 16.45);
        Servico servico1 = new Servico("Lavagem do Carro", 4, 15);
        Servico servico2 = new Servico("Bater o bolo", 97, 568.01);
        Servico servico3 = new Servico("Fechar a porta", 19, 31.44);

        RegistroRecebimentos registroRecebimentos = new RegistroRecebimentos();
        registroRecebimentos.adicionarRecebimento(venda1, venda2, venda3, servico1, servico2, servico3);
        registroRecebimentos.apresentarRecebimentos();
    }
}
