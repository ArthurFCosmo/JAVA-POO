
package pkg8.pkg0.polimorfismo;

public class Peixe extends Animal {
    
    // METODOS PROPRIOS
    
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
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Absorvendo alimentos...");
    }

    @Override
    public void emitirsom() {
        System.out.println("Peixe não faz som.");
    }  
}
