package pkg9.pkg0.projeto_final;

public class Espectador extends Pessoa {
    
    // ATRIBUTOS PROPRIOS
    
    private String login;
    private int totassistido;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotassistido() {
        return totassistido;
    }

    public void setTotassistido(int totassistido) {
        this.totassistido = totassistido;
    }
    
    // CONSTRUTOR 
    
    public Espectador(String nome, int idade, String sexo, String login) {
        this.nome = nome;
        this.login = login;
        this.idade = idade;
        this.sexo = sexo;
        this.totassistido = 0;
    }

    // METODOS PROPRIOS
    
    public void assistir(Video video) {
        this.setTotassistido(++this.totassistido);
        video.receberview();
    }
    
    public void darlike(Video video) {
        video.receberlike();
    }
    
    public void status() {
        System.out.println("----- " + this.getNome() + " -----");
        System.out.println("Total de videos assistidos: " + this.getTotassistido());
        System.out.println("------------");
    }
    
}
