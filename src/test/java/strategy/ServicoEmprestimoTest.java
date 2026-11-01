package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoEmprestimoTest {

    @Test
    void deveExecutarEmprestimo() {
        IServico servico = ServicoFactory.obterServico("Emprestimo");
        assertEquals("Empréstimo efetivado", servico.executar());
    }

    @Test
    void deveCancelarEmprestimo() {
        IServico servico = ServicoFactory.obterServico("Emprestimo");
        assertEquals("Empréstimo cancelado", servico.cancelar());
    }
}