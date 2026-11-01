package strategy;

public class ServicoEmprestimo implements IServico {

    @Override
    public String executar() {
        return "Empréstimo efetivado";
    }

    @Override
    public String cancelar() {
        return "Empréstimo cancelado";
    }
}