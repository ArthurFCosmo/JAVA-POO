
package pkg8.pkg0.polimorfismo;

public class Cachorro extends Mamifero {

    // Metodos especiais
    
    public void abanarrabo() {
        System.out.println("Abanando rabo...");
    }
    
    public void reagir(String frase) {
        if (frase.equals("Vai apanhar") || frase.equals("Sai daqui") || frase.equals("Cachorro mau")) {
            System.out.println("Rosnando...");
        } else {
            System.out.println("Abanando rabo...");
        }
    }
    
    public void reagir(int hora, int minuto) {
        if (hora <= 12) {
            System.out.println("Abanando rabo");
        } else if (hora >= 18) {
            System.out.println("Dormindo...");
        } else {
            System.out.println("Abanando rabo...");
            System.out.println("Latindo...");
        }
    }
    
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanando rabo...");
        } else {
            System.out.println("Rosnando...");
        }
    }
}
