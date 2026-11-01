package strategy;

public class LivroDigital extends Livro {

    @Override
    public String verificarEmprestimo() {
        if (this.getPreco() <= 150.0f) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "Ebook";
    }
}