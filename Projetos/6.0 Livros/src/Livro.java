
public class Livro {
    private String titulo;
    private String autor;
    private int totpaginas;
    private int pagatual;
    private boolean aberto;
    private Pessoa leitor;
    
    // CONSTRUTOR
    
    public Livro (String titulo, String autor, int totpaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totpaginas = totpaginas;
        this.pagatual = 1;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    // GETTERS E SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotpagnias() {
        return totpaginas;
    }

    public void setTotpagnias(int totpaginas) {
        this.totpaginas = totpaginas;
    }

    public int getPagatual() {
        return pagatual;
    }

    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    // METODOS ESPECIAIS
    
    
}
