/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg0.projeto_final;

/**
 *
 * @author Arthur
 */
public class Projeto_final {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        
        v[0] = new Video("Fumaca rosa");
        v[1] = new Video ("Hora do rock");
        v[2] = new Video ("Obscura");
        
        Espectador e[] = new Espectador[2];
        
        e[0] = new Espectador("Arthur", 22, "M", "Cosmo123");
        e[1] = new Espectador("Glauber", 22, "M", "Glauberislegend");
        
        e[0].status();
        v[0].status();
        
        e[0].assistir(v[0]);
        
        e[0].status();
        v[0].status();
    }
    
}
