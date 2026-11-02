package strategy;

public class LivroFisico extends Livro {

    @Override
    public boolean validarLimiteEmprestimo() {
        return getPreco() <= 100.0f;
    }

    @Override
    public String getTipo() {
        return "Livro Físico";
    }
}