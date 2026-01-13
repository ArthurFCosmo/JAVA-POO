
package pkg4.pkg0.banco_simples;

import java.security.SecureRandom;

public class Cliente {
    
    // atributos
    private String nome;
    private String CPF;
    private String RG;
    private String DN;
    private String genero;
    private String conta;
    
    // metodos getter
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getRG() {
        return RG;
    }

    public String getDN() {
        return DN;
    }

    public String getGenero() {
        return genero;
    }

    public String getConta() {
        return conta;
    }
    
    // metodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setDN(int dia, int mes, int ano) {
        this.DN = dia + "/" + mes + "/" + ano;        
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
    
    // metodo construtor

    public Cliente(String nome, String CPF, String RG, String DN, String genero) {
        // Recebendo nome e removendo espaços antes e depois
        this.nome = nome.trim();
        
        
        // Recebendo CPF e RG e limpando tudo que não são números usando regex
        this.CPF = CPF.replaceAll("\\D", "");
        this.RG = RG.replaceAll("\\D", "");
        
        
        // Recebendo a Data de nascimento
        this.DN = DN.replaceAll("\\D", "");
          
        
//        Limpando a DN
//        String DNLIMPA = DN.replaceAll("\\D", "");
//        Criando objeto para fazer uma String formatada com a classe StringBuilder
//        StringBuilder DNFINAL = new StringBuilder();
//        
//         Criando a String Formatada
//        DNFINAL.append(DNLIMPA.substring(0, 2));
//        DNFINAL.append("/");
//        DNFINAL.append(DNLIMPA.substring(2, 4));
//        DNFINAL.append("/");
//        DNFINAL.append(DNLIMPA.substring(4, 8));
//        
//        this.DN = DNFINAL.toString();
        
        
        // Recebendo o genero
        
        if (genero.toUpperCase().startsWith("MA") || genero.toUpperCase().startsWith("HO") || genero.toUpperCase().equals("M")) {
            this.genero = "MASC";
        } else if (genero.toUpperCase().startsWith("FE") || genero.toUpperCase().startsWith("MU") || genero.toUpperCase().equals("F")) {
            this.genero = "FEM";
        } else {
            this.genero = "N/A";
        }
        
        // criando conta aleatoria
            SecureRandom random = new SecureRandom();
            StringBuilder codigoconta = new StringBuilder();

            for (int i = 0; i < 8; i++) {
                codigoconta.append(random.nextInt(10));
            }
            
            codigoconta.append("-");
            codigoconta.append(random.nextInt(10));

            String resultado = codigoconta.toString();
        this.conta = resultado;
    }
    
    // metodos abstratos
    public void status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("RG: " + this.getRG());
        System.out.println("DN: " + this.getDN());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Num. Conta: " + this.getConta());
    }
    
}
