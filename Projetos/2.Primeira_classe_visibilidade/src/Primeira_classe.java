import java.util.Scanner;

public class Primeira_classe {
    public static void main(String[] args) {
        
        // Instanciando uma caneta "c1" a partir da classe caneta
        Caneta c1 = new Caneta();
        c1.modelo = "Padrao";
        c1.cor = "Preta";
        c1.ponta = 0.7f;
        c1.carga = 70;
        c1.tampada = true;
        
        c1.status(); // Usando método que printa o status na tela
        
        
        String resposta = ""; // Criando variável que receberá resposta do usuário dentro do laço
        
        while (!"5".equals(resposta)){ // Definindo condição de parada do laço (escolher a opção 5)
            
            System.out.println("");
            System.out.print("Deseja usar algum metodo?\n[0] Status\n[1] Destampar\n[2] Tampar\n[3] Rabiscar\n[4] Recarregar\n[5] Finalizar\nSua resposta: ");
            
            
            Scanner teclado = new Scanner(System.in); // Instanciando scanner que vai usar o teclado para gerar uma string "resposta"
            resposta = teclado.nextLine();
            
            if ((!"0".equals(resposta)) && (!"1".equals(resposta)) && (!"2".equals(resposta)) && (!"3".equals(resposta)) && (!"4".equals(resposta)) && (!"5".equals(resposta))){ // se a resposta for inválida
                System.out.println("Resposta deve ser: 0, 1; 2; 3; 4 ou 5.");
            }else if ("0".equals(resposta)) { // Opção 0 Exibir status da caneta
                c1.status();
            }else if ("1".equals(resposta)) { // Opção 1 Destampar a caneta
                c1.destampar();
            } else if ("2".equals(resposta)) { // Opção 2 Tampar a caneta
                c1.tampar();
            } else if ("3".equals(resposta)) { // Opção 3 Rabiscar (gasta 20 cargas)
                c1.rabiscar();
            } else if ("4".equals(resposta)) { // Opção 4 Recarregar a caneta 
                c1.recarregar();
            } else if ("5".equals(resposta)) { // Opção 5 Quebrar o laço e finalizar o programa
                break;
            }
        }
    }
    
}
