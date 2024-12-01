package casas.abstract_factory;

import casas.Sorte;

public interface SorteFactory {
    Sorte criarSorte(int posicao, String nome);
}
