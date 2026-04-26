
package pkg8.pkg0.polimorfismo;

public class Ave extends Animal {
    
    // ATRIBUTOS PROPRIOS
    
    protected String cordapena;
    
    // GETTERS E SETTERS

    public String getCordapena() {
        return cordapena;
    }

    public void setCordapena(String cordapena) {
        this.cordapena = cordapena;
    }
    
    // METODOS HERDADOS

    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo grãos...");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de ave...");
    }  
}
