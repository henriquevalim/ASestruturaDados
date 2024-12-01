package casas.abstract_factory;

import casas.Ferrovia;

public interface FerroviaFactory {
    Ferrovia criarFerrovia(int posicao, String nome, int preco, int corrida);
}
