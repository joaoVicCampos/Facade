package org.padroes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ViajanteTest {

    @AfterEach
    void limparPendencias() {
        Documentacao.getInstancia().limparPendencias();
        FinanceiroViagem.getInstancia().limparPendencias();
        SeguroViagem.getInstancia().limparPendencias();
    }

    @Test
    void deveRetornarPendenciaDocumentacaoEmbarque() {
        Viajante viajante = new Viajante();
        Documentacao.getInstancia().addViajantePendente(viajante);

        assertFalse(viajante.embarcar());
    }

    @Test
    void deveRetornarPendenciaFinanceiroEmbarque() {
        Viajante viajante = new Viajante();
        FinanceiroViagem.getInstancia().addViajantePendente(viajante);

        assertFalse(viajante.embarcar());
    }

    @Test
    void deveRetornarPendenciaSeguroEmbarque() {
        Viajante viajante = new Viajante();
        SeguroViagem.getInstancia().addViajantePendente(viajante);

        assertFalse(viajante.embarcar());
    }

    @Test
    void deveRetornarViajanteSemPendenciaEmbarque() {
        Viajante viajante = new Viajante();

        assertTrue(viajante.embarcar());
    }
}

