
package pkg7.pkg0.heranca;

public class Aluno extends Pessoa {
    
    // Atributos
    
    private String curso;
    private String matricula;
    private boolean mensalidadependente;
    
    // GETTERS E SETTERS
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public String getCurso(){
        return curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isMensalidadependente() {
        return mensalidadependente;
    }

    public void setMensalidadependente(boolean mensalidadependente) {
        this.mensalidadependente = mensalidadependente;
    }
    
    
    
    // METODOS ESPECIAIS
    
    public void pagarmensalidade() {
        this.mensalidadependente = false;
    }
    
    @Override
    public void fazeraniversario() {
        this.idade = ++idade;
        this.setMensalidadependente(true);
    }
    
    
    public void status() {
        System.out.println("---------- ALUNO ----------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Mensalidade esta pendente? " + this.isMensalidadependente());
        System.out.println("----------------------------");
    }
}
