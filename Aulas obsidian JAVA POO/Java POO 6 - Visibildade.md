
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
