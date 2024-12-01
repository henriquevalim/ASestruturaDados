package casas.abstract_factory.concreta;

import casas.PontoDePartida;
import casas.abstract_factory.PontoDePartidaFactory;

public class PontoDePartidaFactoryConcreta implements PontoDePartidaFactory {
    @Override
    public PontoDePartida criarPontoDePartida(int posicao, String nome) {
        return new PontoDePartida(posicao, nome);
    }
}
