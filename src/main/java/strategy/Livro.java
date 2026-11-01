package strategy;

public class Livro {

    private float nota;

    public float getPreco() {
        return nota;
    }

    public void somarPreco(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.nota = calculadora.calcular(new OperacaoSomar());
    }

    public void subtrairPreco(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.nota = calculadora.calcular(new OperacaoSubtrair());
    }

    public void dividirPreco(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.nota = calculadora.calcular(new OperacaoDividir());
    }

    public void multiplicarPreco(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.nota = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaPrecos(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.nota = calculadora.calcular(new OperacaoMedia());
    }

}