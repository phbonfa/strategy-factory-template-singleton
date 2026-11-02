package strategy;

public interface IServico {
    String executar(Livro livro, Operacao estrategia, float valorAjuste);
}