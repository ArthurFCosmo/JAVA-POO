
---

## 💠O que é herança?

Herança no Java orientado a objetos nada mais é do que a capacidade de uma classe tem de herdar atributos e métodos de outra, que se define por `classe mãe`.

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