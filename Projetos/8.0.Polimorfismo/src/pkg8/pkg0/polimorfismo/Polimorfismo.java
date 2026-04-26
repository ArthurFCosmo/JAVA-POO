package pkg8.pkg0.polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        Canguru c = new Canguru();
        Mamifero m = new Mamifero();
        Tartaruga t = new Tartaruga();
        
        c.usarbolsa();
        c.locomover();
        m.locomover();
        t.locomover();
        c.alimentar();
        t.alimentar();
        m.alimentar();
        
        Cachorro brutos = new Cachorro();
        
        System.out.println("Novo cachorro criado.");
        
        brutos.reagir(false);
    }
    
}
