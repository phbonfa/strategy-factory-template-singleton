package strategy;

public abstract class Livro {

    private int codigo;
    protected String titulo;
    private float preco;

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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float calcularPrecoAjustado(Operacao operacao, float valorAjuste) {
        return operacao.calcular(this.preco, valorAjuste);
    }

    public void somarPreco(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.preco = calculadora.calcular(new OperacaoSomar());
    }

    public void subtrairPreco(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.preco = calculadora.calcular(new OperacaoSubtrair());
    }

    public void dividirPreco(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.preco = calculadora.calcular(new OperacaoDividir());
    }

    public void multiplicarPreco(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.preco = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaPrecos(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.preco = calculadora.calcular(new OperacaoMedia());
    }

    public abstract String verificarEmprestimo();

    public String getTipo() {
        return "Livro";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "codigo=" + this.codigo +
                ", titulo='" + this.titulo + '\'' +
                ", resultado=" + this.verificarEmprestimo() +
                '}';
    }
}