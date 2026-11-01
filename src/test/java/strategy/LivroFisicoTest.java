package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroFisicoTest {

    //  Teste strategy
    @Test
    void deveSomarPrecoLivro() {
        LivroFisico livro = new LivroFisico();
        livro.somarPreco(80.0f, 20.0f);
        assertEquals(100.0f, livro.getPreco());
    }

    @Test
    void deveSubtrairPrecoLivro() {
        LivroFisico livro = new LivroFisico();
        livro.subtrairPreco(80.0f, 10.0f);
        assertEquals(70.0f, livro.getPreco());
    }

    @Test
    void deveMultiplicarPrecoLivro() {
        LivroFisico livro = new LivroFisico();
        livro.multiplicarPreco(80.0f, 1.1f);
        assertEquals(88.0f, livro.getPreco());
    }

    @Test
    void deveDividirPrecoLivro() {
        LivroFisico livro = new LivroFisico();
        livro.dividirPreco(100.0f, 2.0f);
        assertEquals(50.0f, livro.getPreco());
    }

    @Test
    void naoDeveDividirPrecoLivroPorZero() {
        try {
            LivroFisico livro = new LivroFisico();
            livro.dividirPreco(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaPrecoesLivro() {
        LivroFisico livro = new LivroFisico();
        livro.calcularMediaPrecos(70.0f, 80.0f);
        assertEquals(75.0f, livro.getPreco());
    }

    // Testes Template Method

    @Test
    void deveRetornarAprovado() {
        LivroFisico livro = new LivroFisico();
        livro.setPreco(80.0f);
        assertEquals("Aprovado", livro.verificarEmprestimo());
    }

    @Test
    void deveRetornarReprovado() {
        LivroFisico livro = new LivroFisico();
        livro.setPreco(120.0f);
        assertEquals("Reprovado", livro.verificarEmprestimo());
    }

    @Test
    void deveRetornarInformacoes() {
        LivroFisico livro = new LivroFisico();
        livro.setPreco(120.0f);
        livro.setTitulo("Engenharia de Software");
        livro.setCodigo(101);
        assertEquals("Livro{codigo=101, titulo='Engenharia de Software', resultado=Reprovado}", livro.getInfo());
    }
}