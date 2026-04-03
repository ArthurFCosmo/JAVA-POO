
public class Lutador {
    
    // DEFINANDO ATRIBUTOS DO LUTADOR
    
    private String nome;
    private int peso;
    private int idade;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;
    
    // CONSTRUTOR
    
    public Lutador(String nome, int peso, int idade){
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;

        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;

        this.setCategoria(); // ESSENCIAL
}
    
    // MÉTODO PARA EXIBIR STATUS DO LUTADOR
    
    public void status() {
         System.out.println("------------ " + this.getNome() + " ------------");
         System.out.println("Peso: " + this.getPeso());
         System.out.println("Idade: " + this.getIdade());
         System.out.println("Categoria: " + this.getCategoria());
         System.out.println("Vitorias: " + this.getVitorias());
         System.out.println("Empates: " + this.getEmpates());
         System.out.println("Derrotas: " + this.getDerrotas());
         System.out.println("-------------------------------------------");
    }
        
    // GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() > 90) {
            this.categoria = "Pesado";
        } else if (this.getPeso() > 80) {
            this.categoria = "Meio pesado";
        } else if (this.getPeso() > 70) {
            this.categoria = "Medio";
        } else if (this.getPeso() > 60) {
            this.categoria = "Leve";
        } else if (this.getPeso() > 50) {
            this.categoria = "Mosca";
        } else {
            this.categoria = "Atomo";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    // MÉTODO PARA REGISTRAR AS ESTATÍSTICAS
    
    public void vencer() {
        this.setVitorias(++vitorias);
    }

    public void empatar() {
        this.setEmpates(++empates);
        
}

    public void perder() {
        this.setDerrotas(++derrotas);
}
    
}

    
