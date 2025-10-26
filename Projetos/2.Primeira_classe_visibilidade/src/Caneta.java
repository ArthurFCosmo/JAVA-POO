

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("");
        System.out.println("=========================");
        System.out.println("STATUS DA CANETA");
        System.out.println("=========================");
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta + " mm");
        System.out.println("Carga: " + this.carga + "%");
        
        if (tampada == true) {
            System.out.println("Tampada? Sim");
        } else {
            System.out.println("Tampada? Nao");
        }
    }
    
    void rabiscar(){
        if (tampada == true) {
            System.out.println("Impossivel rabiscar: Caneta tampada.");
        } else if (carga <= 0) {
            System.out.println("Impossivel rabiscar: Caneta sem carga");
        } else {
            System.out.println("Estou rabiscando...");
            carga -= 20;
        }
    }
    
    void tampar(){
        if (tampada == false) {
            tampada = true;
            System.out.println("A caneta foi tampada!");
        } else {
            System.out.println("A caneta ja esta tampada.");
        }
    }
    
    void destampar(){
        if (tampada == true) {
            tampada = false;
            System.out.println("A caneta foi destampada!");
        } else {
            System.out.println("A caneta ja está destampada.");
        }
    }
    
    void recarregar() {
        carga = 100;
        System.out.println("Caneta recarregada! Carga: " + this.carga + "%");
    }
}
