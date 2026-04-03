

public class Lutas_agregacao {
    public static void main (String [] args){
        Lutador lutador1 = new Lutador("Arthur Cosmo", 81, 21);
        Lutador lutador2 = new Lutador("Vitor Silverio", 82, 21);
        
        lutador1.status();
        lutador2.status();
        
        Luta luta1 = new Luta("Luta 1", lutador1, lutador2, 0);
        
        luta1.status();
        
        luta1.lutar();
        
        lutador1.status();
        lutador2.status();
        
        luta1.lutar();
        
        lutador1.status();
        lutador2.status();
        
        luta1.lutar();
        
        lutador1.status();
        lutador2.status();
        
        luta1.lutar();
        
        lutador1.status();
        lutador2.status();
    }
}
