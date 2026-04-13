
---

## 💠O que é herança?

Herança no Java orientado a objetos nada mais é do que a capacidade de uma classe tem de herdar atributos e métodos de outra classe base que se define por `classe mãe`.

Por exemplo, temos as seguintes classes:

![[{76E6C560-C089-43F3-B762-B5F9417F5FA7}.png]]

Perceba que existem muitos atributos repetidos, que todas essas classes tem por se referirem a pessoas.

Portanto, podemos criar uma classe mãe contendo esses atributos e métodos, visto que serão criadas essas 3 classes usando essas características.

![[{92155E20-D659-4C3B-9000-48BE58DC3DDC}.png]]

Essa classe com informações mais gerais, funciona como `classe mãe`.

![[{57F37038-8091-4FB3-B555-46C127F60360}.png]]

No algoritmo, representamos que uma classe é filha de outra da seguinte forma:

`classe Aluno estende Pessoa`

Com essa declaração, podemos dizer que a classe aluno é uma classe pessoa com bônus.

Após fazer essas declarações, você pode chamar os métodos da classe mãe se referindo a um objeto instanciado pela classe filha. Por exemplo:

```java
p1 = new aluno();

p1.setNome("Arthur")
```

Nesse exemplo, usamos um atributo declarado na superclasse `Pessoa` para um objeto da classe filha `Aluno`.

- UMA CLASSE MÃE TAMBÉM PODE SER CHAMADA DE **SUPERCLASSE**.

## 💠Árvore de heranças

Uma classe filha (subclasse), também pode ter filhas, especificando e adicionando ainda mais conteúdo à classe mãe.

Veja esse diagrama com funcionalidades representadas por letras:

![[{746B61C5-57F1-41BC-92A0-3AFA20230DA7}.png|298]]

Nesse caso, temos a classe mãe A, e suas subclasses.

Perceba que a subclasse AA tem tudo que A tem, e a AAA tem tudo que AA tem, e por consequência também tem o conteúdo de A.

As classes mais específicas da árvore, as que ficam mais distantes classe mãe, se chamam classe `FOLHA`.

A classe mais geral, a mais abrangente que é mãe de todas, se chama de classe `RAIZ`.

## 💠Tipos de herança

- Herança de implementação

	A herança para implementação é um termo que se usa quando estamos criando uma classe já na intenção de criar descendentes dela. Toda classe abstrata usa a herança para implementação, por exemplo.

- Herança de diferenças

	A herança para diferenças consiste em criar classes descendentes de uma superclasse, afim de adicionar implementações nela.

## 💠Classes Abstratas

- As classes abstratas, são classes totalmente progenitoras, que não podem ser instanciadas (gerar objetos a partir delas).

  Veja esse exemplo:
  
```
classe abstrata pessoa
	privado nome: Caractere
	privado idade: Inteiro
	privado Sexo: Caractere
	
	publico metodo final fazeraniv()
	fimmetodo
fimclasse
```

   Essa classe seria inútil dessa forma, pois não conseguimos criar nada a partir dela pelo fato dela ter sido declarada como abstrata.

   Para poder instanciar algo, precisaríamos declarar uma classe filha, que herdaria todos os dados dessa classe abstrata.

```
classe visitante estende pessoa
	publico metodo final checkin()
	fimmetodo
fimclasse
```

   Agora adicionamos uma classe filha, que herdará tudo que a classe pessoa tem, adicionando o método `checkin()`.

   Agora podemos implementar um objeto da classe Visitante usando os atributos e métodos herdados da superclasse Pessoa.

## 💠Métodos Abstratos
   
- Métodos abstratos, são métodos declarados mas não implementados na mesma classe. Nós utilizamos eles anteriormente para criar interfaces.

  Eles são declarados em uma classe, por exemplo:
  
  ```
  publico interface interfacevisitante
	  publico metodo checkin()
	  fimmetodo
  fiminterface
  ```

  E após isso implementados em outra classe usando a sobreposição:

```
classe visitante
	@sobrepor
	publico metodo checkin()
	...
	fimemetodo
fimclasse
```

## 💠Métodos e Classes finais

- As classes finais não podem ser herdadas por outras classes. Elas são obrigatoriamente folhas, não pode ter filhas.

- Métodos finais não podem ser sobrescritos por suas subclasses, ele é obrigatoriamente herdado. É útil para quando tivermos um atributo que não muda, como uma data de nascimento.