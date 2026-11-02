package strategy;

public class ServicoEmprestimo implements IServico {

    @Override
    public String executar(Livro livro, Operacao estrategia, float valorAjuste) {
        return livro.processarEmprestimo(estrategia, valorAjuste);
    }
}