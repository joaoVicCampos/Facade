package org.padroes;

public class ServicoPagamento {
    public String processar(String viajante, double valor) {
        return "Pagamento de R$" + String.format("%.2f", valor) + " processado para " + viajante + ".";
    }
}

