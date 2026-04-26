
package pkg8.pkg0.polimorfismo;

public class Mamifero extends Animal {
    
    // ATRIBUTOS PROPRIOS
    
    protected String cordopelo;
    
    // GETTERS E SETTERS

    public String getCordopelo() {
        return cordopelo;
    }

    public void setCordopelo(String cordopelo) {
        this.cordopelo = cordopelo;
    }
    
    // METODOS HERDADOS
    
    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de mamifero...");
    }  
}
