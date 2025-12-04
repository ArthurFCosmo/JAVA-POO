package pkg3.metodos_especiais;
public class GPU {
    public String modelo;
    private int vram;
    private String prefixo;
    private int geracao;
    private int segmento;
    private String sufixo;
    private Boolean overclock;
    private int temperatura;
    private int uso;
    public String atividade;
    
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
    
    public String getModelo(){
        return this.modelo;
    }
    
    public String getAtividade(){
        return this.atividade;
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
    
    public void setAtividade(String a) {
        this.atividade = a;
    }
    
    public void setUso(int u) {
        this.uso = u;
    }
    
    public void setTemperatura(int i ){
        this.temperatura = i;
    }
    
    public void ligarpc() {
        
        if ("Ligada S.O.".equals(atividade) || "Jogando".equals(atividade)) {
            System.out.println("-------------"); 
            System.out.println("PC já está ligado!");
            System.out.println("-------------");
        } else {
            this.setAtividade("Ligada S.O.");
            this.setUso(10);
            System.out.println("-------------"); 
            System.out.println("Ligando computador... PC ligado!");
            System.out.println("-------------");
            
        }
    }
    
    public void desligarpc() {
        if ("Desligada".equals(atividade)) {
            System.out.println("-------------"); 
            System.out.println("PC já está desligado!");
            System.out.println("-------------"); 
        } else {
            this.setAtividade("Desligada");
            this.setUso(0);
            this.setTemperatura(25);
            System.out.println("-------------"); 
            System.out.println("Desligando computador... PC desligado!");
            System.out.println("-------------");
        }
    }
    
    public void iniciarjogo() {
        if ("Ligada S.O.".equals(atividade)){
            this.setAtividade("Jogando");
            this.setUso(99);
            this.setTemperatura(65);
            System.out.println("-------------"); 
            System.out.println("Iniciando jogo... Jogo rodando!");
            System.out.println("-------------"); 
        }
        else if ("Jogando".equals(atividade)) {
            System.out.println("Jogo já está rodando.");
        }
        else {
            System.out.println("PC está desligado!");
        }
    }
    
    public void finalizarjogo() {
        if ("Jogando".equals(atividade)) {
            this.setAtividade("Ligada S.O.");
            this.setUso(10);
            this.setTemperatura(25);
            System.out.println("-------------"); 
            System.out.println("Finalizando jogo... Jogo finalizado!");
            System.out.println("-------------"); 
        }
        else if ("Ligada S.O.".equals(atividade))  {
            System.out.println("-------------"); 
            System.out.println("Nenhum jogo rodando.");
            System.out.println("-------------"); 
        } else {
            System.out.println("-------------");
            System.out.println("PC Desligado.");
            System.out.println("-------------"); 
        }
           
    }
}
