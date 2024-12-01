package casas.abstract_factory;

import casas.ServicoPublico;

public interface ServicoPublicoFactory {
    ServicoPublico criarServicoPublico(int posicao, String nome, int preco);
}
