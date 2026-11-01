package strategy;

public class Parametros {

    private Parametros() {}
    private static Parametros instance = new Parametros();

    public static Parametros getInstance() {
        return instance;
    }

    private String nomeBiblioteca;
    private String usuarioLogado;

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}