package casas.abstract_factory;

import casas.Propriedade;

public interface PropriedadeFactory {
    Propriedade criarPropriedade(int posicao, String nome, String grupo, int preco, int aluguel);
}
