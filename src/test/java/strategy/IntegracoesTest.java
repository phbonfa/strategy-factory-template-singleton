package strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegracoesTest {

    @BeforeEach
    void setUp() {
        ContextoBiblioteca.getInstance().setUsuarioLogado("Operador1");
        ContextoBiblioteca.getInstance().setNomeBiblioteca("Biblioteca Central");
    }

    @Test
    void deveExecutarFluxoIntegradoComSucesso() {
        IServico servico = ServicoFactory.obterServico("Emprestimo");
        LivroFisico livro = new LivroFisico();
        livro.setPreco(80.0f);

        String resultado = servico.executar(livro, new OperacaoSomar(), 20.0f);

        assertEquals("Aprovado", resultado);
        assertEquals(100.0f, livro.getPreco());
        assertEquals("Operador1", livro.getOperadorProcessamento());
    }

    @Test
    void deveReprovarNoTemplateMethodQuandoPrecoExcederLimite() {
        IServico servico = ServicoFactory.obterServico("Emprestimo");
        LivroFisico livro = new LivroFisico();
        livro.setPreco(120.0f);

        String resultado = servico.executar(livro, new OperacaoSomar(), 10.0f);

        assertEquals("Reprovado", resultado);
        assertEquals(120.0f, livro.getPreco());
        assertEquals(null, livro.getOperadorProcessamento());
    }

    @Test
    void deveExecutarFluxoComLivroDigitalEStrategyMultiplicar() {
        IServico servico = ServicoFactory.obterServico("Emprestimo");
        LivroDigital ebook = new LivroDigital();
        ebook.setPreco(100.0f);

        String resultado = servico.executar(ebook, new OperacaoMultiplicar(), 1.2f);

        assertEquals("Aprovado", resultado);
        assertEquals(120.00001f, ebook.getPreco());
        assertEquals("Operador1", ebook.getOperadorProcessamento());
    }

    @Test
    void deveExecutarFluxoComLivroDigitalEStrategyMedia() {
        IServico servico = ServicoFactory.obterServico("Emprestimo");
        LivroDigital ebook = new LivroDigital();
        ebook.setPreco(100.0f);

        String resultado = servico.executar(ebook, new OperacaoMedia(), 50.0f);

        assertEquals("Aprovado", resultado);
        assertEquals(75.0f, ebook.getPreco());
        assertEquals("Operador1", ebook.getOperadorProcessamento());
    }

    @Test
    void deveCapturarExcecaoDividirPorZeroNoFluxoIntegrado() {
        IServico servico = ServicoFactory.obterServico("Emprestimo");
        LivroDigital ebook = new LivroDigital();
        ebook.setPreco(100.0f);

        String mensagem = "";
        try {
            servico.executar(ebook, new OperacaoDividir(), 0.0f);
        } catch (IllegalArgumentException e) {
            mensagem = e.getMessage();
        }

        assertEquals("Divisão por zero", mensagem);
    }

    @Test
    void deveCapturarExcecaoServicoInexistenteNaFactory() {
        String mensagem = "";
        try {
            ServicoFactory.obterServico("Desconhecido");
        } catch (IllegalArgumentException e) {
            mensagem = e.getMessage();
        }

        assertEquals("Serviço inexistente", mensagem);
    }

    @Test
    void deveCapturarExcecaoServicoInvalidoNaFactory() {
        String mensagem = "";
        try {
            ServicoFactory.obterServico("Invalido");
        } catch (IllegalArgumentException e) {
            mensagem = e.getMessage();
        }

        assertEquals("Serviço inválido", mensagem);
    }
}