import java.util.Scanner;

public class Primeira_classe {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Padrao";
        c1.cor = "Preta";
        c1.ponta = 0.7f;
        c1.carga = 70;
        c1.tampada = true;
        
        c1.status();
        
        
        String resposta = "";
        
        while (!"5".equals(resposta)){
            
            System.out.println("");
            System.out.print("Deseja usar algum metodo?\n[0] Status\n[1] Destampar\n[2] Tampar\n[3] Rabiscar\n[4] Recarregar\n[5] Finalizar\nSua resposta: ");
            
            
            Scanner teclado = new Scanner(System.in);
            resposta = teclado.nextLine();
            
            if ((!"0".equals(resposta)) && (!"1".equals(resposta)) && (!"2".equals(resposta)) && (!"3".equals(resposta)) && (!"4".equals(resposta)) && (!"5".equals(resposta))){
                System.out.println("Resposta deve ser: 0, 1; 2; 3; 4 ou 5.");
            }else if ("0".equals(resposta)) {
                c1.status();
            }else if ("1".equals(resposta)) {
                c1.destampar();
            } else if ("2".equals(resposta)) {
                c1.tampar();
            } else if ("3".equals(resposta)) {
                c1.rabiscar();
            } else if ("4".equals(resposta)) {
                c1.recarregar();
            } else if ("5".equals(resposta)) {
                break;
            }
        }
    }
    
}
