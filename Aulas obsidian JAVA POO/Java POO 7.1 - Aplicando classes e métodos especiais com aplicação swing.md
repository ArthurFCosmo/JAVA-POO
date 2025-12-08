
---

# 📦 Iniciando o projeto

Vamos fazer um projeto de exibir e manipular os medidores de uma GPU. O programa consiste em um quadro com botões e valores, que mudam conforme são manipulados.

Criamos sem o Maven novamente, usando o Swing. Vamos em > projeto Java com o Ant, sem classe principal, depois criamos o JFrame dentro do pacote. Depois, dentro do mesmo pacote, criamos nossa classe GPU.

![[JAVA POO 7.1 - CLASSES.png]]

# 🔨 Colocando elementos no JFrame

Vamos deixar o JFrame assim:

![[JAVA POO 7.1 - JFRAME.png]]

- 1 Label fixo em negrito para o titulo
- 5 Labels fixos em negrito para os atributos
- 5 Labels variáveis para os valores dos atributos
- 5 Botões para executar os métodos
- 1 Label variado vermelho em negrito para mensagens de feedback (erro)

# ⚙ Fazendo o código

## ✏ Classe GPU

___

Temos os seguintes atributos:

```java
public String modelo;
    private int vram;
    private String prefixo;
    private int geracao;
    private int segmento;
    private String sufixo;
    private String overclock;
    private String msg;
    private int temperatura;
    private int uso;
    private String atividade;
```

`msg` - contém a mensagem de erro que pode ser exibida
`atividade` - mostra o status do que está sendo feito com o PC e como a GPU está sendo utilizada

Os outros atributos dizem respeito a informações técnicas da GPU. Eles são a parte interessante do código, que vai mudar de acordo com as situações.

___

Temos o nosso método construtor:

```java
public GPU(String pre, int ger, int seg, String suf, int vram){ //método construtor
        this.modelo = pre + " " + ger + seg + " " + suf + " " + vram + "Gb";
        this.atividade = "Desligada";
        this.msg = "";
        this.prefixo = pre;
        this.geracao = ger;
        this.segmento = seg;
        this.sufixo = suf;
        this.vram = vram;
        this.atividade = "Desligada";
        this.overclock = "Desativado";
        this.temperatura = 25;
        this.uso = 0;
    }
```

Ele contém as configurações da instância padrão da nossa classe GPU, e recebe muitos parâmetros para preencher os atributos.

Nós teremos a seguinte GPU padrão nos códigos:

```java
GPU g1 = new GPU("GTX", 16, 50, "TI", 4);
```

Gerando uma GTX 1650 TI, com 4gb de VRAM, Desligada, sem mensagem de erro, com overclock desativado, a 25 °C, com 0% de uso.

___

Temos os métodos setters mais básicos:

```java
 public void setAtividade(String a) {
        this.atividade = a;
    }
    
    public void setMsg(String m) {
        this.msg = m;
    }
    
    public void setUso(int u) {
        this.uso = u;
    }
    
    public void setTemperatura(int i ){
        this.temperatura = i;
    }
    
    public void setOverclock (String o){
        this.overclock = o;
    }
```

___

Temos os métodos getters:

```java
public String getModelo(){
        return this.modelo;
    }
        
    public String getAtividade(){
        return this.atividade;
    }
    
    public String getMsg(){
        return this.msg;
    }
    
    public String getVram(){
        return this.vram + "Gb";
    }
    
    public int getTemperatura(){
        return this.temperatura;
    }
    
    public int getUso(){
        return this.uso;
    }
    
    public String getOverclock(){
        return this.overclock;
    }
```

___

Temos os nossos métodos mais funcionais:

```java
    public void ligarpc() {
        
        if ("Ligada S.O.".equals(atividade) || "Jogando".equals(atividade)) {
            this.setMsg("PC já está ligado!");
        } else {
            this.setAtividade("Ligada S.O.");
            this.setUso(10);
            this.setTemperatura(50);
            this.setMsg("Ligando computador... PC ligado!");
        }
    }
    
    public void desligarpc() {
        if ("Desligada".equals(atividade)) {
            this.setMsg("PC já está desligado!");
        } else {
            this.setAtividade("Desligada");
            this.setUso(0);
            this.setTemperatura(25);
            this.setMsg("Desligando computador... PC desligado!");
        }
    }
    
    public void iniciarjogo() {
        if ("Ligada S.O.".equals(atividade)){
            this.setAtividade("Jogando");
            if ("Desativado".equals(overclock)){
                this.setUso(99);
                this.setTemperatura(65);
            } else {
                this.setUso(100);
                this.setTemperatura(80);
            }
            this.setMsg("Iniciando jogo... Jogo rodando!");
        }
        else if ("Jogando".equals(atividade)) {
            this.setMsg("Jogo já está rodando.");
        }
        else {
            this.setMsg("PC está desligado!");
        }
    }
    
    public void finalizarjogo() {
        if ("Jogando".equals(atividade)) {
            this.setAtividade("Ligada S.O.");
            this.setUso(10);
            this.setTemperatura(50);
            this.setMsg("Finalizando jogo... Jogo finalizado!");
        }
        else if ("Ligada S.O.".equals(atividade))  {
            this.setMsg("Nenhum jogo rodando.");
        } else {
            this.setMsg("PC Desligado.");
        }
           
    }
```

Cada método desses, tem uma resposta diferente dependendo se o PC está ligado, se o overclock está ativo, se tem algum jogo rodando. Cada `if` foi feito cuidadosamente para sempre gerar um feedback, mesmo que o user esteja fazendo besteira ou algo sem sentido, para ele saber por que está sendo impedido.

Os métodos alteram o que seria alterado na GPU caso a situação fosse real, ligar o pc muda a temperatura e o uso, ligar um jogo, ligar overclock, tudo muda conforme a realidade simulada.

Temos também esse método que mexe no overclock:

```java
public void changeOverclock() {
        
        if ("Jogando".equals(atividade)){
            this.setMsg("Jogo rodando. Feche para configurar overclock.");
        } else if ("Desligada".equals(atividade)) {
            this.setMsg("PC desligado. Ligue para configurar overclock.");
        } else {
            if ("Desativado".equals(this.overclock)) {
                this.setMsg("Overclock ativado!");
                this.setOverclock("Ativado");
            } else {
                this.setMsg("Overclock Desativado!");
                this.setOverclock("Desativado");
            }
        }
    }
```

Ele foi desenvolvido dessa forma, para funcionar como um interruptor. Tentei usar um atributo `boolean`, mas ficou mais fácil, coerente e funcional. Se eu já vou usar como `string`, não faz sentido eu trazer de `boolean`, para depois passar para `string` novamente.

#### Porque não retornamos (`return`) nada?

Nessa situação, não retornaremos nada em print, pois tudo girará em torno da exibição em swing, no nosso painel criado no começo. Então, armazenaremos as informações através dos nossos métodos setters, para que possam ser acessadas depois com o swing, através dos métodos getters.

___

## ✏ Método principal (Swing)

Logo do começo do código que já vem gerado pelo swing, adicionaremos duas linhas:

```java
public class Jframe_GPU extends javax.swing.JFrame {
    public Jframe_GPU() {
        initComponents();
        varMsg.setVisible(false); // DEIXANDO NOSSA MENSAGEM DE ERRO OCULTA
        
    }
    
    GPU g1 = new GPU("GTX", 16, 50, "TI", 4); // CRIANDO CLASSE COM O CONSTRUTOR
```

Nessas linhas, deixamos nossa mensagem de erro oculta, pois ela só deve ser exibida como feedback. E também instanciamos nossa classe GPU usando o método construtor, para gerar a GTX 1650 TI, como mostrado anteriormente.

A partir de agora, vou mostrar como configurei os botões para modificar os atributos. Tudo foi feito usando nossos métodos setters e getters da classe GPU, ter feito a classe poupou muito tempo, fazendo com que os códigos fossem apenas repetições.

---

### 💠Código do botão Ligar PC:

```java
private void ButtonLigarpcActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        // MÉTODO CONFIGURADO NA CLASSE GPU PARA LIGAR O PC //
        g1.ligarpc();
        
        // MÉTODO PARA MUDAR O TEXTO DA MENSAGEM, QUE É ARMAZENADO NA PROPRIA CLASE COMO STRING //
        varMsg.setText(g1.getMsg());
        
        // MÉTODO PARA MUDAR O TEXTO DA ATIVIDADE, QUE É ARMAZENADO NA PROPRIA CLASE COMO STRING //
        varAtividade.setText(g1.getAtividade());
        
        // MÉTODO PARA MUDAR O TEXTO DA TEMPERATURA, QUE É ARMAZENADO COMO INT //
        varTemperatura.setText(Integer.toString(g1.getTemperatura()));
        
        // MÉTODO PARA MUDAR O TEXTO DO USO, QUE É ARMAZENADO NA PROPRIA CLASE COMO INT //
        varUso.setText(Integer.toString(g1.getUso()));
        
        
        // MÉTODO PARA EXIBIR A MENSAGEM QUE ESTAVA OCULTA POR PADRAO //
        varMsg.setVisible(true);
        
        // CRIANDO OBJETO TIMER PARA FAZER A MENSAGEM SUMIR DEPOIS DE 2 SEGUNDOS //
        javax.swing.Timer timer = new javax.swing.Timer(2000, e -> 
        {varMsg.setVisible(false);});
        timer.setRepeats(false);
        timer.start();
    }
```

Na primeira etapa, ativamos nosso método, que vai fazer a maior parte do trabalho mexendo nos atributos.

A partir daí, vamos apenas usar nossos métodos getters para buscar os atributos que foram modificados e fazer a exibição correta na tela.

Na 6 etapa, temos um método que usamos no começo do código. Ele é usado para exibir a mensagem de erro, que já foi modificada com o método getter, agora está apenas se tornando visível a partir desse método `setVisible(true)`.

#### ⏳Construindo o timer

Na última etapa, usamos um recurso do swing para criar um temporizador. Esse temporizador serve para fazer a mensagem de "erro" sumir da tela depois de alguns instantes.

Nesse temporizador, nós instanciamos um objeto `timer`, usando a classe `Timer` do swing (`javax.swing.Timer timer = newjavax.swing.Timer()`).

Dentro do método, colocamos o primeiro parâmetro, que é o tempo do timer. Usamos o valor 2000; pois é medido em milissegundos, que equivale a 2 segundos. Logo após temos um outro parâmetro, declarado em lambda, que funciona da seguinte forma:

`e ->` Significa o evento, o que ocorrerá no fim do temporizador, após esse símbolo de seta, temos um colchete `{}` de bloco de código normal do Java, e as linhas dentro desse bloco devem terminar em ponto virgula `;`, assim como as linhas dentro de um `if`, por exemplo. E após isso, temos o fim do método timer, necessitando de mais um ponto vírgula. Ficando assim:

```java
        javax.swing.Timer timer = new javax.swing.Timer(2000, e -> 
        {varMsg.setVisible(false);}); // NOTE QUE TEMOS DOIS PONTO VIRGULA //
```

Após isso, temos um método que impede o timer de reiniciar, que é padrão da classe, e um método para iniciar esse timer 2 segundos que instanciamos:

```java
timer.setRepeats(false);
        timer.start();
```

___

### 💠Código dos botões: Desligar o PC, Iniciar jogo, Finalizar jogo

Esses comandos são basicamente cópias do método de ligar o PC, tudo muito simples, pois os métodos já foram definidos na nossa classe GPU. Precisamos apenas fazer a mesma sequencia:

- Chamar o método desejado
- Usar os métodos getters para modificar os atributos na tela
- Revelar a mensagem de "erro" feedback
- Criar o timer

___ 

### 💠Código do botão de overclock

Esse botão funciona de maneira diferente, como interruptor. Queremos que o texto dentro dele mude quando for clicado, que ele tenha apenas dois estados:

![[JAVA POO 7.1 - OVERCLOCK.png]]

Para isso, criamos aquele método diferenciado na nossa classe GPU. Vamos relembrar:


```java
public void changeOverclock() {
        
        if ("Jogando".equals(atividade)){
            this.setMsg("Jogo rodando. Feche para configurar overclock.");
        } else if ("Desligada".equals(atividade)) {
            this.setMsg("PC desligado. Ligue para configurar overclock.");
        } else {
            if ("Desativado".equals(this.overclock)) {
                this.setMsg("Overclock ativado!");
                this.setOverclock("Ativado");
            } else {
                this.setMsg("Overclock Desativado!");
                this.setOverclock("Desativado");
            }
        }
    }
```

Ele tem condicionais para caso o PC esteja desligado ou algum jogo esteja rodando, caso esteja tudo certo, ele desativa o overclock ao clicarmos no botão caso esteja ativo, ou ativa caso esteja desativado. É realmente como um interruptor.

Para isso, usamos o seguinte código para o botão:

```java
private void ButtonOverclockActionPerformed(java.awt.event.ActionEvent evt) {                                                
        g1.changeOverclock();
        
        // MÉTODO PARA MUDAR O TEXTO DA MENSAGEM, QUE É ARMAZENADO NA PROPRIA CLASE COMO STRING //
        varMsg.setText(g1.getMsg());
        
        // MÉTODO PARA EXIBIR A MENSAGEM QUE ESTAVA OCULTA POR PADRAO //
        varMsg.setVisible(true);
        
        // CRIANDO OBJETO TIMER PARA FAZER A MENSAGEM SUMIR DEPOIS DE 2 SEGUNDOS //
        javax.swing.Timer timer = new javax.swing.Timer(2000, e ->
        {varMsg.setVisible(false);});
        timer.setRepeats(false);
        timer.start();
        
        // MUDANDO O TEXTO DO ATRIBUTO //
        varOverclock.setText(g1.getOverclock());
        
        // MUDANDO O TEXTO DO BOTÃO //
        if ("Ativado".equals(g1.getOverclock())) {
            ButtonOverclock.setText("Desativar overclock.");
        } else {
            ButtonOverclock.setText("Ativar overclock");
        }
    }
```

___

