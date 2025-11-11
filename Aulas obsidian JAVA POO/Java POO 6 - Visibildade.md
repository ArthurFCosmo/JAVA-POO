
---

## 💠Níveis de visibilidade

No Java, temos 3 níveis de visibilidade para um elemento:

- Público - Public (+)
- Privado - Private (-)
- Protegido - Protected (#)

Esses níveis de visibilidade dizem respeito a como os elementos poderão ser acessados e modificados dentro das aplicações que utilizam a classe que contém esse elemento.

Por exemplo, ao usar a classe caneta, devemos definir a visibilidade dos elementos, para escolher em que o código pode mexer.

Ex:

![[{FB2AF2C7-1A1F-4A76-A0EF-0FBF18B8F80D}.png]]

Cada visibilidade define quem pode mexer:

Public (+)  A classe, e mais qualquer outra classe (app) podem mexer

Private (-)  Só pode ser modificado pela própria classe

Protected (#) Apenas a própria classe e suas subclasses

## 💠Por que os níveis de visibilidade são importantes?

Esses níveis são importantes para definir onde o código deve modificar e onde não deve, para minimizar erros. Por exemplo, um controle remoto tem botões, que podem ser usados pelo usuário, seriam elementos Public (+). Mas tem componentes internos, como circuitos e placas que não devem ser acessadas pelo usuário, para evitar que ele quebre, são elementos Private (-).

## 💠Como funciona na prática?

Vamos continuar com o exemplo da caneta.

Se na classe Caneta temos o seguinte atributo público:

``` java
public class Caneta {
	public String cor;
}
```

e na nossa classe principal nós o chamamos dessa forma:

```java
public class Primeira_classe {
    public static void main(String[] args) {
        
        // Instanciando uma caneta "c1" a partir da classe caneta
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
    }
}
```

Não teremos erros, pois estamos instanciando uma nova caneta, e modificando o atributo PUBLICO "cor".

Se o atributo cor fosse privado, teríamos um erro na IDE, pois estamos tentando mudar um atributo privado.

##### SE FOSSEMOS MEXER EM UM ATRIBUTO PROTEGIDO:

Caso tivéssemos:

``` java
public class Caneta {
	protected String cor;
}
```

ao executar:

```java
public class Primeira_classe {
    public static void main(String[] args) {
        
        // Instanciando uma caneta "c1" a partir da classe caneta
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
    }
}
```

Não teríamos erros, pois o Java permite que modifiquemos um atributo protegido caso ele esteja dentro de uma classe (classe principal), que utiliza a classe mãe do atributo (caneta).

##### E QUANDO UM MÉTODO É PRIVADO?

Caso tivéssemos:

``` java
public class Caneta {
	private rabiscar();
}
```

e depois:


```java
public class Primeira_classe {
    public static void main(String[] args) {
        
        // Instanciando uma caneta "c1" a partir da classe caneta
        Caneta c1 = new Caneta();
        c1.rabiscar();
    }
}
```

Receberíamos um erro, pois rabiscar() é um método privado.

##### E QUANDO UM MÉTODO PÚBLICO MEXE EM UM ATRIBUTO PRIVADO?

Caso tivéssemos:

``` java
public class Caneta {
	
	private boolean tampada;
	
	public void tampar(){
        tampada = true;
    }
}
```

Em que o atributo tampada é privado, mas temos um método público que modifica esse atributo.

Ao chamar o método público, ele prevaleceria. Pois, as mudanças ocorrem dentro da classe Caneta. Você chama o método na classe principal, mas o código dentro dele (rotina) acontece dentro da classe Caneta. Você pode chamá-lo por que é público. E ele pode modificar pois está dentro da classe.