package org.padroes;

import java.util.HashSet;
import java.util.Set;

public class SeguroViagem {
    private static final SeguroViagem instancia = new SeguroViagem();
    private final Set<Viajante> viajantesPendentes = new HashSet<>();

    private SeguroViagem() {
    }

    public static SeguroViagem getInstancia() {
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

