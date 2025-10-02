
---

## 💠 O que seria um objeto?

Para a POO, um objeto é tudo aquilo que pode ser percebido e descrito com base em suas características, comportamentos e estado atual. 

---

#### Um objeto pode ser MATERIAL, ex:

#### OBJETO: *Caneta*

- ATRIBUTOS
	COR: vermelha
	PONTA: 0.5mm

- STATUS
	TAMPADA: sim
	CARREGADA: sim

-  COMPORTAMENTOS
	ESCREVER
	FURAR


#### Um objeto pode ser ABSTRATO, ex:

#### OBJETO: *Compromisso*

- ATRIBUTOS
	URGÊNCIA: URGENTE
	CONFIDENCIALIDADE: CONFIDENCIAL

- STATUS
	SUSPENSO: não
	MARCADO: não

- COMPORTAMENTOS
	CANCELAR
	CONVOCAR


## 💠 O que seria uma classe?

Objetos pertencem a uma classe. Uma classe funciona como um molde para criar objetos.

Nos conceitos de POO, todo objeto deve responder a 3 perguntas: O que o objeto tem, o que objeto faz, e como ele está no momento?

Vamos com o exemplo da caneta.

CANETA TEM:

	COR
	PONTA

CANETA FAZ:

	ESCREVER
	FURAR

CANETA ESTÁ:

	FUNCIONANDO

Essas três perguntas têm nomes, são eles: *Atributos*, *métodos* e *estado*.


## 💠 Como tirar um objeto do molde, fazê-lo existir?

Temos o molde, agora podemos criar canetas a partir desses parâmetros. O nome disso é *instanciar*.

Criar um objeto a partir de uma classe. Instanciar uma classe em forma de um objeto.

Ex:

nome_do_objeto = nova nome_da_classe

```java
caneta_arthur = new caneta

caneta_arthur.cor = "azul"
caneta_arthur.ponta = 0.5
caneta_arthur.escrever()
```


## 💠 Em resumo...

Classe define os atributos e métodos que serão compartilhado pelos objetos.

Um objeto é uma instância de uma classe.
