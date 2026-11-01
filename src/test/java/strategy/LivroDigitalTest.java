package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroDigitalTest {

    @Test
    void deveRetornarAprovado() {
        LivroDigital ebook = new LivroDigital();
        ebook.setPreco(140.0f);
        assertEquals("Aprovado", ebook.verificarEmprestimo());
    }

    @Test
    void deveRetornarReprovado() {
        LivroDigital ebook = new LivroDigital();
        ebook.setPreco(160.0f);
        assertEquals("Reprovado", ebook.verificarEmprestimo());
    }

    @Test
    void deveRetornarInformacoes() {
        LivroDigital ebook = new LivroDigital();
        ebook.setPreco(100.0f);
        ebook.setTitulo("Padroes de Projeto");
        ebook.setCodigo(202);
        assertEquals("Ebook{codigo=202, titulo='Padroes de Projeto', resultado=Aprovado}", ebook.getInfo());
    }
}