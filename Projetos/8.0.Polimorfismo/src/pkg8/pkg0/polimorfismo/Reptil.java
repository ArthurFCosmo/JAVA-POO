
package pkg8.pkg0.polimorfismo;

public class Reptil extends Animal {
    
    // ATRIBUTOS PROPRIOS
    
    protected String cordaescama;
    
    // GETTERS E SETTERS

    public String getCordaescama() {
        return cordaescama;
    }

    public void setCordaescama(String cordaescama) {
        this.cordaescama = cordaescama;
    }
    
    // METODOS HERDADOS

    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais...");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de reptil...");
    }  
}
