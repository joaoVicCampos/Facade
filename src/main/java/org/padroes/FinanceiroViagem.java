package org.padroes;

import java.util.HashSet;
import java.util.Set;

public class FinanceiroViagem {
    private static final FinanceiroViagem instancia = new FinanceiroViagem();
    private final Set<Viajante> viajantesPendentes = new HashSet<>();

    private FinanceiroViagem() {
    }

    public static FinanceiroViagem getInstancia() {
        return instancia;
    }

    public void addViajantePendente(Viajante viajante) {
        viajantesPendentes.add(viajante);
    }

    public boolean temPendencia(Viajante viajante) {
        return viajantesPendentes.contains(viajante);
    }

    public void limparPendencias() {
        viajantesPendentes.clear();
    }
}

