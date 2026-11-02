package strategy;

public abstract class Livro {

    private int codigo;
    private String titulo;
    private float preco;
    private String operadorProcessamento;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTipo() {
        return "Livro";
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getOperadorProcessamento() {
        return operadorProcessamento;
    }

    public String processarEmprestimo(Operacao estrategiaAjuste, float valorAjuste) {
        if (!validarLimiteEmprestimo()) {
            return "Reprovado";
        }

        Calculadora calculadora = new Calculadora(this.preco, valorAjuste);
        this.preco = calculadora.calcular(estrategiaAjuste);

        this.operadorProcessamento = ContextoBiblioteca.getInstance().getUsuarioLogado();

        return "Aprovado";
    }

    public abstract boolean validarLimiteEmprestimo();

    public String getInfo() {
        return getTipo() + "{codigo=" + codigo + ", titulo='" + titulo
                + "', preco=" + preco + ", resultado=" + validarLimiteEmprestimo() + "}";
    }
}