
---

## 💠Criando nossa primeira classe

Vamos criar uma classe "Caneta" que vai servir como molde para instanciar diferentes canetas.

- Dentro do nosso pacote teremos nossa classe principal, que será o programa (PSVN - public static void main).

- Dentro do pacote teremos nossa classe Caneta (public class Caneta {})

Vamos começar pela nossa classe:

```java
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
```

Nesse primeiro bloco de código, definimos os atributos e status do nosso objeto.

Na próxima parte, vamos criar métodos.

```java
void status() {
        System.out.println("");
        System.out.println("=========================");
        System.out.println("STATUS DA CANETA");
        System.out.println("=========================");
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta + " mm");
        System.out.println("Carga: " + this.carga + "%");
        
        if (tampada == true) {
            System.out.println("Tampada? Sim");
        } else {
            System.out.println("Tampada? Nao");
        }
    }
```

Esse é nosso primeiro método. Temos o void, pois ele não retorna nenhum valor, apenas executa uma rotina, que é escrever todas as características da nossa caneta.

## 💠Atenção com o uso do `this`

Precisamos nos atentar ao uso do `this`. Esse elemento serve para se referir ao objeto que está chamando o método.

Por exemplo: Se estamos trabalhando com uma caneta instanciada como "Caneta 1", esse `this`, serve para dizer "O que acontecer a partir de agora, está se referindo a Caneta 1". Se no caso fosse `this.carga`, seria exibido a carga da Caneta 1. Esse `this` dá essa diretriz de pertencimento.

```java
    void tampar(){
        if (tampada == false) {
            tampada = true;
            System.out.println("A caneta foi tampada!");
        } else {
            System.out.println("A caneta ja esta tampada.");
        }
    }
    
    void destampar(){
        if (tampada == true) {
            tampada = false;
            System.out.println("A caneta foi destampada!");
        } else {
            System.out.println("A caneta ja está destampada.");
        }
    }
```

Continuando, agora temos os métodos tampar e destampar, que também são void.

```java
void rabiscar(){
        if (tampada == true) {
            System.out.println("Impossivel rabiscar: Caneta tampada.");
        } else if (carga <= 0) {
            System.out.println("Impossivel rabiscar: Caneta sem carga");
        } else {
            System.out.println("Estou rabiscando...");
            carga -= 20;
        }
    }
    
void recarregar() {
        carga = 100;
        System.out.println("Caneta recarregada! Carga: " + this.carga + "%");
    }
```

Por último, temos os métodos rabiscar() e recarregar(), que manipulam a carga da caneta. Um gasta, e um recarrega. Bem simples.

## 💠 Utilizando nossa classe em um programa (classe principal)

Criei um laço que funciona como menu seletor, para usar os nossos métodos da caneta instanciada. Leia os comentários do código:

```java
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

```