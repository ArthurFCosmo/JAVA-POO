
package pkg7.pkg0.heranca;

public class Professor extends Pessoa {
    
    // ATRIBUTOS
    
    private String especialidade;
    private Float salario;
    
    // GETTERS E SETTERS

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
    
    // METODOS ESPECIAIS
    
    public void receberaumento(float valor){
        this.salario += valor;
    }
    
    
}
