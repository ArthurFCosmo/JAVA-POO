
package pkg8.pkg0.polimorfismo;

public class Canguru extends Mamifero{
    
    // POLIMORFANDO UM METODO HERDADO
    
    @Override
    public void locomover() {
        System.out.println("Pulando...");
    }
    
    // METODO PROPRIO
    
    public void usarbolsa() {
        System.out.println("Usando bolsa...");
    }
    
}
