package casas.command;

import jogo.Peca;

public class ComandoStatus implements Comando{
    @Override
    public void executar(Peca peca) {
        peca.status();
    }
}
