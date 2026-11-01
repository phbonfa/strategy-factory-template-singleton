package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivrosTest {

    @Test
    void deveSomarPrecoLivro() {
        Livro livro = new Livro();
        livro.somarPreco(80.0f, 20.0f);
        assertEquals(100.0f, livro.getPreco());
    }

    @Test
    void deveSubtrairPrecoLivro() {
        Livro livro = new Livro();
        livro.subtrairPreco(80.0f, 10.0f);
        assertEquals(70.0f, livro.getPreco());
    }

    @Test
    void deveMultiplicarPrecoLivro() {
        Livro livro = new Livro();
        livro.multiplicarPreco(80.0f, 1.1f);
        assertEquals(88.0f, livro.getPreco());
    }

    @Test
    void deveDividirPrecoLivro() {
        Livro livro = new Livro();
        livro.dividirPreco(100.0f, 2.0f);
        assertEquals(50.0f, livro.getPreco());
    }

    @Test
    void naoDeveDividirPrecoLivroPorZero() {
        try {
            Livro livro = new Livro();
            livro.dividirPreco(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaPrecoesLivro() {
        Livro livro = new Livro();
        livro.calcularMediaPrecos(70.0f, 80.0f);
        assertEquals(75.0f, livro.getPreco());
    }
}