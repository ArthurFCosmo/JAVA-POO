
---

## 💠O que é polimorfismo?

O sentido do termo polimorfismo vem da mudança de forma, transformação. Na POO, o polimorfismo se dá quando usamos o mesmo elemento, mas ele se comporta de maneiras diferentes dependendo da circunstância.

## 💠O que é assinatura?

Todo método tem assinaturas, e esse conceito é tratado no polimorfismo.

- A assinatura de um método são as quantidades e os tipos de parâmetro.

Não estão inclusos outros elementos na assinatura de um método, nem o retorno, nem nada, apenas os parâmetros e seus tipos.

Se os métodos tiverem a mesma quantidade de parâmetros e os mesmos tipos para esses parâmetros, esses métodos terão a mesma assinatura.

## 💠Polimorfismo de sobreposição

O polimorfismo de sobreposição se dá quando um método que já foi declarado em uma classe ancestral é declarado novamente em uma classe descendente, alterando seu funcionamento.

- Os métodos devem ter a mesma assinatura, mas estarem em classes diferentes.

Por exemplo, temos uma classe mãe chamada Animal, e subclasses descendentes dela.

![[{B4799414-FEDB-446D-A574-B1F204633FAB}.png]]

- Independente de qualquer coisa, sempre que se declara um atributo em uma classe, os métodos getters e setters devem ser implementados na mesma classe. Se você adicionar um atributo numa classe filha, você também deve criar os getters e setters nela.

Todos os métodos são abstratos, e eles serão implementados de maneira diferente para cada animal, usando o comando de sobrescrição. Por exemplo, o método locomover() da classe `mamífero` sobrescreverá o método abstrato locomover() da superclasse `animal`. Isso é necessário para poder usar o método locomover(), que é abstrato, ele precisa ser instanciado em uma outra classe.

- `@Override` -> comando para sobrescrever um método. Logo depois desse comando, você deve repetir exatamente a mesma estrutura que usou para declarar o método anteriormente, mas dessa vez você deve desenvolvê-lo dentro das chaves {}.

![[{EB20B121-1455-4EE2-9E08-428094536C65}.png]]

Agora, inserindo mais especializações como classes folha, descendentes de mamífero, réptil, peixe e ave, a sobrescrição faz mais sentido.

Veja que a classe canguru também tem o método locomover, mas como o canguru não corre, ele pula, esse método precisa ser sobrescrito, sofrendo polimorfismo.

O mesmo se aplica à tartaruga, ela não rasteja, ela anda, diferente de alguns répteis. Por isso o método locomover() precisou sofrer polimorfismo.

## 💠Polimorfismo de sobrecarga

No polimorfismo de sobrecarga, utilizamos o mesmo método várias vezes na mesma classe para reagir diferente dependendo do parâmetro implementado.

- Os métodos devem estar na mesma classe, mas ter assinaturas diferentes.

Vamos continuar nos exemplos de animais.

Digamos que temos a classe `Cachorro`, e nela temos o método `reagir()`. Esse método deve apresentar comportamentos diferentes de acordo com o tipo de parâmetro passado.

![[{9B428B1B-6B73-4484-ABBE-87EB7FCC2A21}.png]]

- falar frase (String)
- horario do dia (int, int)
- dono (boolean)
- idade e peso (int, float)

Veja que os parâmetros são diferentes para cada situação, isso faz os métodos atenderem à regra de possuírem assinaturas diferentes.

Podemos fazer a classe com esses métodos dessa forma:

```java
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
```

Veja que o método `reagir()` se repete de várias formas, mas com parâmetros em diferentes tipos e quantidades.