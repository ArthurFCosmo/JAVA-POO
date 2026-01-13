
package pkg4.pkg0.banco_simples;

public class Conta {
    
    // atributos
    private String numero;
    private Cliente titular; 
    private String tipo;
    private float saldo;
    
    // metodos getter
    public String getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public String getTipo() {
        return tipo;
    }

    public float getSaldo() {
        return saldo;
    }
    
    // metodos setter
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //metodos abstratos
    
    public void depositar(float deposito){
        this.saldo += deposito;
    }
    
    public void sacar (float saque) {
        if (this.saldo - saque < 0) {
            System.out.println("Voce nao pussui saldo suficiente para sacar essa quantia.");
            System.out.println("Saldo: " + this.saldo);
        }
        else {
            this.saldo -= saque;
        }
    }
            
}
