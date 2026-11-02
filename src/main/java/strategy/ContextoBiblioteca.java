package strategy;

public class ContextoBiblioteca {

    private static ContextoBiblioteca instance = new ContextoBiblioteca();
    private String usuarioLogado;
    private String nomeBiblioteca;

    private ContextoBiblioteca() {}

    public static ContextoBiblioteca getInstance() {
        return instance;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }
}