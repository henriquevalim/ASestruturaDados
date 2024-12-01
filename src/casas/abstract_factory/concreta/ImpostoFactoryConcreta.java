package casas.abstract_factory.concreta;

import casas.Imposto;
import casas.abstract_factory.ImpostoFactory;

public class ImpostoFactoryConcreta implements ImpostoFactory {
    @Override
    public Imposto criarImposto(int posicao, String nome, boolean impostoRiqueza) {
        return new Imposto(posicao, nome, impostoRiqueza);
    }
}
