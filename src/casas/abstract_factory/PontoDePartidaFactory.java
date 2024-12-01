package casas.abstract_factory;

import casas.PontoDePartida;

public interface PontoDePartidaFactory {
    PontoDePartida criarPontoDePartida(int posicao, String nome);
}
