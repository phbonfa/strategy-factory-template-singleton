package strategy;

public class LivroFisico extends Livro {

    @Override
    public String verificarEmprestimo() {
        if (this.getPreco() <= 100.0f) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}