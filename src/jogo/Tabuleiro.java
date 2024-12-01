package jogo;

import casas.Sorte;
import casas.CofreComunitario;
import casas.*;
import casas.abstract_factory.*;
import casas.abstract_factory.concreta.*;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    private final ArrayList<Casa> casas;

    public Tabuleiro() {
        this.casas = new ArrayList<>();
        inicializarCasas();
    }

    private void inicializarCasas(){

        PropriedadeFactory propriedadeFactory = new PropriedadeFactoryConcreta();
        CofreComunitarioFactory cofreComunitarioFactory = new CofreComunitarioFactoryConcreta();
        FerroviaFactory ferroviaFactory = new FerroviaFactoryConcreta();
        ServicoPublicoFactory servicoPublicoFactory = new ServicoPublicoFactoryConcreta();
        SorteFactory sorteFactory = new SorteFactoryConcreta();
        ImpostoFactory impostoFactory = new ImpostoFactoryConcreta();
        PrisaoFactory prisaoFactory = new PrisaoFactoryConcreta();
        PontoDePartidaFactory pontoDePartidaFactory = new PontoDePartidaFactoryConcreta();

        casas.add(propriedadeFactory.criarPropriedade(1, "Casa do Bosque",  "roxo",  20000000,  110000));
        casas.add(cofreComunitarioFactory.criarCofreComunitario(2, "Cofre Comunitário 1"));
        casas.add(propriedadeFactory.criarPropriedade(3, "Apartamento Central", "roxo", 35000000,  180000));
        casas.add(impostoFactory.criarImposto(4, "Imposto de Renda", false));
        casas.add(ferroviaFactory.criarFerrovia(5, "Reading Railroad",  200, 0));
        casas.add(propriedadeFactory.criarPropriedade(6, "Vila das Flores", "ciano", 40000000,  220000));
        casas.add(sorteFactory.criarSorte(7, "Chance 1"));
        casas.add(propriedadeFactory.criarPropriedade(8, "Pousada da Praia", "ciano", 50000000, 270000));
        casas.add(propriedadeFactory.criarPropriedade(9, "Mansão da Colina", "ciano", 60000000, 330000));
        casas.add(prisaoFactory.criarPrisao(10, "Prisão: Apenas Visitando",  true));
        casas.add(propriedadeFactory.criarPropriedade(11, "Residência do Lago", "rosa", 45000000, 250000));
        casas.add(servicoPublicoFactory.criarServicoPublico(12, "Companhia Elétrica", 150));
        casas.add(propriedadeFactory.criarPropriedade(13, "Cobertura Diamante",  "rosa", 70000000, 370000));
        casas.add(propriedadeFactory.criarPropriedade(14, "Edifício Horizonte", "rosa", 55000000, 290000));
        casas.add(ferroviaFactory.criarFerrovia(15, "Pennsylvania Railroad",  200, 0));
        casas.add(propriedadeFactory.criarPropriedade(16, "Chácara do Sol", "laranja", 30000000, 160000));
        casas.add(cofreComunitarioFactory.criarCofreComunitario(17, "Cofre Comunitário 2"));
        casas.add(propriedadeFactory.criarPropriedade(18, "Fazenda Boa Vista", "laranja", 25000000, 130000));
        casas.add(propriedadeFactory.criarPropriedade(19, "Fazenda teste1", "laranja", 100000, 50000));
        casas.add(new CasaTeste(20, "Free Parking"));
        casas.add(propriedadeFactory.criarPropriedade(21, "Fazenda teste2", "vermelho", 100000, 50000));
        casas.add(sorteFactory.criarSorte(22, "Chance 2"));
        casas.add(propriedadeFactory.criarPropriedade(23, "Fazenda teste3", "vermelho", 100000, 50000));
        casas.add(propriedadeFactory.criarPropriedade(24, "Fazenda teste4", "vermelho", 100000, 50000));
        casas.add(ferroviaFactory.criarFerrovia(25, "B & O Railroad", 200, 0));
        casas.add(propriedadeFactory.criarPropriedade(26, "Fazenda teste5", "amarelo", 100000, 50000));
        casas.add(propriedadeFactory.criarPropriedade(27, "Fazenda teste6", "amarelo", 100000, 50000));
        casas.add(servicoPublicoFactory.criarServicoPublico(28, "Companhia de Água", 150));
        casas.add(propriedadeFactory.criarPropriedade(29, "Fazenda teste7", "amarelo", 100000, 50000));
        casas.add(prisaoFactory.criarPrisao(30, "Vá para Prisão",  false));
        casas.add(propriedadeFactory.criarPropriedade(31, "Fazenda teste8", "verde", 100000, 50000));
        casas.add(propriedadeFactory.criarPropriedade(32, "Fazenda teste9", "verde", 100000, 50000));
        casas.add(cofreComunitarioFactory.criarCofreComunitario(33, "Cofre Comunitário 3"));
        casas.add(propriedadeFactory.criarPropriedade(34, "Fazenda teste10", "verde", 100000, 50000));
        casas.add(ferroviaFactory.criarFerrovia(35, "Short Line", 200, 0));
        casas.add(sorteFactory.criarSorte(36, "Chance 3"));
        casas.add(propriedadeFactory.criarPropriedade(37, "Fazenda teste11",  "azul", 100000, 50000));
        casas.add(impostoFactory.criarImposto(38, "Imposto de Riqueza", true));
        casas.add(propriedadeFactory.criarPropriedade(39, "Fazenda teste12", "azul", 100000, 50000));
        casas.add(pontoDePartidaFactory.criarPontoDePartida(40, "Ponto de Partida"));

    }

    public Casa getCasaNaPosicao(int posicao) {
        for (Casa casa : casas) {
            if (casa.getPosicao() == posicao) {
                return casa;
            }
        }
        return null;
    }

    public List<Ferrovia> getFerrovias() {
        List<Ferrovia> ferrovias = new ArrayList<>();
        for (Casa casa : casas) {
            if (casa instanceof Ferrovia) {
                ferrovias.add((Ferrovia) casa);
            }
        }
        return ferrovias;
    }

    public List<ServicoPublico> getServicoPublico() {
        List<ServicoPublico> servicoPublicos = new ArrayList<>();
        for (Casa casa : casas) {
            if (casa instanceof ServicoPublico) {
                servicoPublicos.add((ServicoPublico) casa);
            }
        }
        return servicoPublicos;
    }

}
