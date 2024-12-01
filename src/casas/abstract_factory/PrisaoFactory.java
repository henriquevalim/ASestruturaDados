package casas.abstract_factory;

import casas.Prisao;

public interface PrisaoFactory {
    Prisao criarPrisao(int posicao, String nome, boolean visitandoPrisao);
}
