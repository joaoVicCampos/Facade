package org.padroes;

public class Viajante {

    public boolean embarcar() {
        return ViajanteFacade.getInstancia().verificarPendencias(this);
    }
}

