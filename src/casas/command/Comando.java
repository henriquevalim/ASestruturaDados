package casas.command;

import jogo.Peca;

public interface Comando {
    // Uso do padrão comportamental 'Command' para tratar os comandos da classe Prisão
    void executar(Peca peca);
}
