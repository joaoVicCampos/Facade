package org.padroes;

import java.util.HashSet;
import java.util.Set;

public class Documentacao {
    private static final Documentacao instancia = new Documentacao();
    private final Set<Viajante> viajantesPendentes = new HashSet<>();

    private Documentacao() {
    }

    public static Documentacao getInstancia() {
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

