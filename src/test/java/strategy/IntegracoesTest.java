package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegracoesTest {

    @Test
    void deveIntegrarTodosOsPadroesNoFluxoDeEmprestimo() {

        Parametros parametros = Parametros.getInstance();
        parametros.setNomeBiblioteca("Biblioteca Central");
        parametros.setUsuarioLogado("Bibliotecario1");

        assertEquals("Biblioteca Central", Parametros.getInstance().getNomeBiblioteca());

        IServico servicoEmprestimo = ServicoFactory.obterServico("Emprestimo");
        assertEquals("Empréstimo efetivado", servicoEmprestimo.executar());

        LivroFisico livro = new LivroFisico();
        livro.setCodigo(101);
        livro.setTitulo("Engenharia de Software");
        livro.setPreco(90.0f);

        assertEquals("Aprovado", livro.verificarEmprestimo());
        assertEquals("Livro{codigo=101, titulo='Engenharia de Software', resultado=Aprovado}", livro.getInfo());

        Operacao taxaAdicional = new OperacaoSomar();
        float precoComTaxa = livro.calcularPrecoAjustado(taxaAdicional, 10.0f);

        assertEquals(100.0f, precoComTaxa);
    }
}