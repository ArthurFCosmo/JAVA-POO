/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthur
 */
public class GPU {
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
}
