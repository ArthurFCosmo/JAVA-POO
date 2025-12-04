
---

No Java, existem alguns métodos especiais, nessa aula vamos abordar os métodos do tipo: Getter, Setter, Construtor.

Cada método em si tem sua importância, mas a semelhança deles, é que todos servem para controlar melhor o acesso aos atributos, afim de mantar o código mais consistente, organizado, e seguro.

## 💠Métodos Setter e Getter

Vamos começar com os métodos setter e getter, que servem para modificar e consultar o valor dos atributos. No entanto, surge uma dúvida: Por que não defini-los diretamente usando `recebe` ? Isso é respondido com as aulas anteriores, de visibilidade. O professor usou o exemplo do caixa de supermercado:

Digamos que eu peguei um bolo que custa R$ 40,00. Quero me dirigir ao caixa e pagar usando uma nota de R$ 50 que eu tenho, para receber R$ 10,00 de troco.

Eu poderia muito bem, honestamente, me dirigir ao caixa, abrir a caixa registradora, colocar os meus 50, tirar 10 (de troco), fechar a caixa, e ir embora com o bolo. Mas concorda que isso não parece muito correto? Além de não ser seguro, pode causar diversos problemas dependendo de quem vai operar a ação.

Então para isso existe o atendente do caixa, que é um funcionário (confiável) que faz a operação por mim, para garantir que ela seja feita da maneira correta sempre. Os métodos Getters e Setters servem como esse intermediário.

![[ESQUEMA METODOS GETTER E SETTER E ATENDENTE DE CAIXA.png]]

## 💠Métodos Construtores

Os métodos construtores tem um conceito um pouco mais simples, eles servem para definir atributos padrão na criação de uma classe, ou para criar uma classe mais rapidamente, através de parâmetros

---
## 💠Métodos especiais na prática

#### - Método getter

```java
Public Class Caneta {
	public String modelo;
	
	public getModelo() {
		return this.modelo;
	}
}
```

Nesse pequeno código, criamos um atributo chamado `modelo`, e a partir dele criamos um novo método, com o nome independente, mas remetendo ao atributo (essa semelhança é opcional, mas ajuda na coesão do código).  A rotina dentro desse método, é apenas uma: retornar o modelo da instância atual (Objeto criado a partir da classe). Como resultado, isso será um print na tela com o valor do atributo `modelo`.

```java
public void status() {
        System.out.println("-------------");
        System.out.println("Sobre a GPU");
        System.out.println("-------------");
        System.out.println("Atividade: " + this.getAtividade());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("VRAM: " + this.vram + " Gb");
        System.out.println("Overclock: " + this.overclock);
        System.out.println("Temperatura: " + this.getTemperatura());
        System.out.println("Uso: " + this.getUso());
        System.out.println("-------------");        
    }
```

Temos esse método um pouco mais completo, com vários métodos getters dentro de sua rotina.

#### - Método setter

O método setter é um pouco mais complexo, pois ele recebe um parâmetro, que será usado para definir um novo valor para um atributo. Ex:

```java
public void setTemperatura(int i ){
        this.temperatura = i;
    }
```

Na declaração do método, temos um parâmetro inteiro (int), chamado `i`, em seguida, na rotina nós declaramos que o "atributo x" (nesse caso, `temperatura`) receberá o valor de `i`, que foi passado pelo parâmetro.

#### - Método construtor

Ainda mais complexo, temos o método construtor, que recebe vários parâmetros. Aqui vai um exemplo:

```java
public GPU(String pre, int ger, int seg, String suf, int vram){ //método construtor
        this.modelo = pre + " " + ger + seg + " " + suf + " " + vram + "Gb";
        this.atividade = "Desligada";
        this.prefixo = pre;
        this.geracao = ger;
        this.segmento = seg;
        this.sufixo = suf;
        this.vram = vram;
        this.atividade = "Desligada";
        this.overclock = false;
        this.temperatura = 25;
        this.uso = 0;
    }
```

`!! É IMPORTANTE RESSALTAR QUE UM MÉTODO CONSTRUTOR SEMPRE TEM O MESMO NOME DA CLASSE AO QUAL PERTENCE !!`

Esse método recebe vários parâmetros, string, int, etc. sinta-se livre para cobrar parâmetros, só lembre de usá-los depois. Dentro da rotina, também podemos usar um método setter, caso ele já tenha sido criado. Ex:

```java
public GPU(String modelo) {
	this.setModelo(modelo)
}
```




