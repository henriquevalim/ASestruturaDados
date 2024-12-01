package casas.abstract_factory;

import casas.Imposto;

public interface ImpostoFactory {
    Imposto criarImposto(int posicao, String nome, boolean impostoRiqueza);
}
