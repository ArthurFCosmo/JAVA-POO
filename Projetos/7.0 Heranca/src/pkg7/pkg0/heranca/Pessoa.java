package pkg7.pkg0.heranca;

public abstract class Pessoa {
    
    // ATRIBUTOS
    
    private String nome;
    protected int idade;
    private String sexo;
    
    // GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    // METODOS ESPECIAIS
    public void fazeraniversario() {
        this.idade = ++idade;
    }
}
