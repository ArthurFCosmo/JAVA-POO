package pkg3.metodos_especiais;
import java.util.Scanner;

public class Metodos_especiais {
    public static void main(String[] args) {
        GPU g1 = new GPU("GTX", 16, 50, "TI", 4);
        g1.status();
        
        int resposta;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Escolha uma acao \n[1] Ligar pc\n[2] Iniciar jogo\n[3] Finalizar jogo\n[4] Desligar pc\n[5] Status\n[0] Finalizar programa\nSua acao: ");
            resposta = teclado.nextInt();

        switch (resposta) {
                case 1 -> g1.ligarpc();
                case 2 -> g1.iniciarjogo();
                case 3 -> g1.finalizarjogo();
                case 4 -> g1.desligarpc();
                case 5 -> g1.status();
                default -> System.out.println("Resposta inválida. Escolha uma das opções!");
            }
            
        } while (resposta != 0);
    }  
}
