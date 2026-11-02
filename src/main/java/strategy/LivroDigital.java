package strategy;

public class LivroDigital extends Livro {

    @Override
    public boolean validarLimiteEmprestimo() {
        return getPreco() <= 150.0f;
    }

    @Override
    public String getTipo() {
        return "Livro Digital";
    }

}