package casas.abstract_factory.concreta;

import casas.CofreComunitario;
import casas.abstract_factory.CofreComunitarioFactory;

public class CofreComunitarioFactoryConcreta implements CofreComunitarioFactory {
    @Override
    public CofreComunitario criarCofreComunitario(int posicao, String nome) {
        return new CofreComunitario(posicao, nome);
    }
}
