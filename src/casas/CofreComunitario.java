package casas;

import java.util.Collections;
import java.util.ArrayList;

import cartas.Cartas;
import cartas.Movimento;
import cartas.Pagamento;
import cartas.SairPrisao;
import jogo.Jogador;
import jogo.Peca;

public class CofreComunitario extends Casa {
    private ArrayList<Cartas> cartas;
    private int indexAtual;

    public CofreComunitario(int posicao, String nome){
        super(posicao, nome);
        this.indexAtual = 0;
        this.cartas = new ArrayList<>();
        inicializarCartas();
        embaralharCartas();
    }

    private void inicializarCartas() {
        cartas.add(new Movimento(1, "Avance para o Ponto de Partida (Go)", "Receba $200", 40, true, false, false));
        cartas.add(new Pagamento(2, "Erro do Banco em seu Favor", "Receba $200", 200, false));
        cartas.add(new Pagamento(3, "Taxa do Médico", "Pague $50", 50, true));
        cartas.add(new Pagamento(4, "Abertura da Grande Ópera", "Receba $50 de cada jogador pelas entradas",  50, false));
        cartas.add(new Pagamento(5, "Da Liquidação Fora de Estoque", "Receba $45", 40,false));
        cartas.add(new SairPrisao(6, "Saia Livre da Prisão, sem cartas.Pagar", "Esta carta pode ser mantida até o uso ou venda. Veja a user story sobre a prisão"));
        cartas.add(new Movimento(7, "Vá para a Prisão", "Vá direto para a prisão – Não passe pelo ponto de partida – Não receba $200", 30, false, false, false));
        cartas.add(new Pagamento(8, "Restituição do Imposto de Renda", "Receba $20", 20, false));
        cartas.add(new Pagamento(9, "Aniversário do Seguro de Vida", "Receba $100", 100, false));
        cartas.add(new Pagamento(10, "Pague o Hospital", "Pague $100", 100, true));
        cartas.add(new Pagamento(11, "Pague Taxa da Escola", "Pague $150", 150, true));
        cartas.add(new Pagamento(12, "Receba por Seus Serviços", "Receba $25", 25, false));
        cartas.add(new Pagamento(13, "Aniversário dos Fundos de Natal", "Receba $100", 100, false));
        cartas.add(new Pagamento(14, "Você Tirou o Segundo Lugar no Concurso de Beleza", "Receba $10", 10, false));
        cartas.add(new Pagamento(15, "Você Herdou", "Receba $100", 100, false));
        cartas.add(new Pagamento(16, "Você deve pagar os reparos da rua", "Pague $40 por cada casa, $115 por hotel", 150, true));
    }

    public Cartas getCartaAleatoria() {
        if (indexAtual >= cartas.size()) {
            embaralharCartas();
            indexAtual = 0;
        }

        Cartas carta = cartas.get(indexAtual);
        indexAtual++;
        return carta;
    }
    private void embaralharCartas() {
        Collections.shuffle(cartas);
    }

    @Override
    public void oferecerCompra(Jogador jogador) {

    }

    @Override
    public void venderPara(Jogador jogador) {

    }

    public void executarAcao(Peca peca) {
        System.out.println(" e o peão avançou para " + getPosicao() + " – " + getNome() + ".");
        Cartas cartaSorteada = getCartaAleatoria();
        System.out.println(cartaSorteada.getNome());
        System.out.println(cartaSorteada.getDescricao());
        cartaSorteada.executarAcao(peca);
    }
}
