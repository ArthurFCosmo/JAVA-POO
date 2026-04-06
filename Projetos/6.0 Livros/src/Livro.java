
public class Livro implements InterfaceLivro {
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
    
    // METODOS ESPECIAIS DA INTERFACE

    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Livro aberto.");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Livro fechado.");
    }

    @Override
    public void folhear(int folha) {
        if (folha < this.getTotpagnias()) {
            this.setPagatual(folha);
        } else {
            System.out.println("Impossível folhear dessa forma.");
        }
    }

    @Override
    public void avancarpag() {
        this.setPagatual(++pagatual);
    }

    @Override
    public void voltarpag() {
        this.setPagatual(--pagatual);
    }
    
    @Override
    public void detalhes() {
        System.out.println("------------ " + this.getTitulo() + " ------------");
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de pags: " + this.getTotpagnias());
        System.out.println("Pag atual: " + this.getPagatual());
        System.out.println("Leitor: " + this.leitor.getNome());
        System.out.println("Aberto? " + this.isAberto());
        System.out.println("------------------------------------");
    }
}
