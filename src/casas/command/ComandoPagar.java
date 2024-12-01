package casas.command;

import jogo.Peca;

public class ComandoPagar implements Comando {
    @Override
    public void executar(Peca peca) {
        int valorFianca = 50;

        if (peca.getJogador().getDinheiro() >= valorFianca) {

            System.out.println("Você pagou para sair da prisão!");
            peca.getJogador().diminuirDinheiro(valorFianca);
            peca.resetarJogadas();

        } else {
            System.out.println("Você não tem dinheiro suficiente para pagar a fiança e sair da prisão.");
        }
    }
}
