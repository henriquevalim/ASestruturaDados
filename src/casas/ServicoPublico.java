package casas;

import jogo.Jogador;
import jogo.Peca;

import java.util.Scanner;

public class ServicoPublico extends Casa{
    private int preco;

    public ServicoPublico(int posicao, String nome, int preco) {
        super(posicao, nome);
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public void oferecerCompra(Jogador jogador) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("O título do serviço " + getNome() + " está disponível por $" + getPreco() + ".");
        System.out.println(jogador.getNome() + ", você possui $" + jogador.getDinheiro() + ".");

        System.out.print("Você deseja comprar " + getNome() +  " (Sim/Não)? ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            venderPara(jogador);
        }

    }

    @Override
    public void venderPara(Jogador jogador) {
        if (jogador.getDinheiro() >= getPreco()) {
            jogador.comprarServicoPublico(this);
        } else {
            System.out.println(jogador.getNome() + ", você não tem dinheiro suficiente para comprar esta propriedade.");
        }
    }

    @Override
    public void executarAcao(Peca peca) {
        System.out.println(" e o peão avançou para " + getPosicao() + " – " + getNome());

        if (getProprietario() != null) {
            System.out.println("O serviço público " + getNome() + " já possui proprietário.");

            int taxa = getPreco();

            peca.getJogador().diminuirDinheiro(taxa);
            getProprietario().aumentarDinheiro(taxa);

            System.out.println("O jogador " + peca.getJogador().getNome() + " pagou a taxa fixa de $" + taxa +
                    " para " + getProprietario().getNome());
            System.out.println("Novo saldo: $" + peca.getJogador().getDinheiro());

        } else {
            oferecerCompra(peca.getJogador());
        }
    }

}
