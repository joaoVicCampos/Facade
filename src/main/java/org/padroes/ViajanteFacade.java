package org.padroes;

public class ViajanteFacade {
    private static final ViajanteFacade instancia = new ViajanteFacade();

    private ViajanteFacade() {
    }

    public static ViajanteFacade getInstancia() {
        return instancia;
    }

    public boolean verificarPendencias(Viajante viajante) {
        if (Documentacao.getInstancia().temPendencia(viajante)) {
            return false;
        }
        if (FinanceiroViagem.getInstancia().temPendencia(viajante)) {
            return false;
        }
        if (SeguroViagem.getInstancia().temPendencia(viajante)) {
            return false;
        }
        return true;
    }
}

