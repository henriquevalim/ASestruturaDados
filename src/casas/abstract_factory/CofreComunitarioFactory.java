package casas.abstract_factory;

import casas.CofreComunitario;

public interface CofreComunitarioFactory {

    CofreComunitario criarCofreComunitario(int posicao, String nome);
}
