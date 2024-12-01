package casas.abstract_factory.concreta;

import casas.Prisao;
import casas.abstract_factory.PrisaoFactory;

public class PrisaoFactoryConcreta implements PrisaoFactory {
    @Override
    public Prisao criarPrisao(int posicao, String nome, boolean visitandoPrisao) {
        return new Prisao(posicao, nome, visitandoPrisao);
    }
}
