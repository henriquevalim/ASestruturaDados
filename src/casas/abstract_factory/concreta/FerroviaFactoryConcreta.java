package casas.abstract_factory.concreta;

import casas.Ferrovia;
import casas.abstract_factory.FerroviaFactory;

public class FerroviaFactoryConcreta implements FerroviaFactory {
    @Override
    public Ferrovia criarFerrovia(int posicao, String nome, int preco, int aluguel) {
        return new Ferrovia(posicao, nome, preco, aluguel);
    }
}
