package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    void deveRetornarNomeBiblioteca() {
        Parametros.getInstance().setNomeBiblioteca("Biblioteca Central");
        assertEquals("Biblioteca Central", Parametros.getInstance().getNomeBiblioteca());
    }

    @Test
    void deveRetornarUsuarioLogado() {
        Parametros.getInstance().setUsuarioLogado("Admin");
        assertEquals("Admin", Parametros.getInstance().getUsuarioLogado());
    }
}