package casas;

import jogo.Jogador;
import jogo.Peca;

public class Imposto extends Casa{
    private boolean impostoRiqueza;
    public Imposto(int posicao, String nome, boolean impostoRiqueza) {
        super(posicao, nome);
        this.impostoRiqueza = impostoRiqueza;
    }

    public boolean isImpostoRiqueza() {
        return impostoRiqueza;
    }

    public void setImpostoRiqueza(boolean impostoRiqueza) {
        this.impostoRiqueza = impostoRiqueza;
    }

    @Override
    public void oferecerCompra(Jogador jogador) {

    }

    @Override
    public void venderPara(Jogador jogador) {

    }

    @Override
    public void executarAcao(Peca peca) {
        System.out.println(" e o peão avançou para " + getPosicao() + " – " + getNome());

        int impostoRiqueza = 75;
        int impostoRenda = 200;

        if(!isImpostoRiqueza()){
            // pagar imposto de renda
            System.out.println("O jogador " + peca.getJogador().getNome() + " pagou $" + impostoRenda + " de imposto de renda.");
            peca.getJogador().diminuirDinheiro(impostoRenda);
            System.out.println("Novo saldo: $" + peca.getJogador().getDinheiro() + "\n");

        } else {
            // pagar imposto de riqueza
            System.out.println("O jogador " + peca.getJogador().getNome() + " pagou $" + impostoRiqueza + " de imposto de riqueza.");
            peca.getJogador().diminuirDinheiro(impostoRiqueza);
            System.out.println("Novo saldo: $" + peca.getJogador().getDinheiro() + "\n");
        }

    }
}
