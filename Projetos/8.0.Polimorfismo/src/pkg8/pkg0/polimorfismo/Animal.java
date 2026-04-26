/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.pkg0.polimorfismo;

public abstract class Animal {
    
    // ATRIBUTOS
    
    protected int idade;
    protected float peso;
    protected int qtdmembros;
    
    // GETTERS E SETTERS

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getQtdmembros() {
        return qtdmembros;
    }

    public void setQtdmembros(int qtdmembros) {
        this.qtdmembros = qtdmembros;
    }
    
    

    // METODOS PARA HERANCA
    
    public void locomover(){};
    public void alimentar(){};
    public void emitirsom(){};
    
}
