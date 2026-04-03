
public class Luta {
    
    // DEFININDO OS ATRIBUTOS DA LUTA
    
    private String nome;
    private Lutador desafiador;
    private Lutador desafiado;
    private String categoria;
    private String status;
    private int rounds;
    
    // CONSTRUTOR

    public Luta(String nome, Lutador desafiador, Lutador desafiado, int rounds) {
        this.nome = nome;
        this.desafiador = desafiador;
        this.desafiado = desafiado;
        this.setStatus("Tudo Ok");
        this.setCategoria();
        this.rounds = rounds;
    }
    
    // MÉTODO PARA EXIBIR CARD DA LUTA
    
    public void status() {
         System.out.println("============ " + this.getNome() + " ============");
         desafiador.status();
         desafiado.status();
         System.out.println("Rounds: " + this.getRounds());
         System.out.println("Categoria: " + this.getCategoria());
         System.out.println("Status: " + this.getStatus());
         System.out.println("====================================");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Lutador getDesafiador() {
        return desafiador;
    }

    public void setDesafiador(Lutador desafiador) {
        this.desafiador = desafiador;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public String getCategoria() {
        return categoria;
    }
    
    // DEFININDO A CATEGORIA DA LUTA BASEADO NOS LUTADORES
    
    private void setCategoria() {
        if (desafiador.getCategoria().equals(desafiado.getCategoria())){
            this.categoria = desafiador.getCategoria();              
        } else {
            this.setStatus("Cancelada");
            System.out.println("A luta " + this.getNome()+ " nao pode acontecer pois os lutadores tem categorias incompativeis.");
            this.categoria = "Incompativel";
        }       
    }

    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
    // MÉTODO PARA FAZER A LUTA ACONTECER
    
    public void lutar() {
        System.out.println("Marcando luta...");
        if (!this.getStatus().equals("Cancelada")) {
            System.out.println("Lutando...");
            int resultado = (int) (1 + Math.random() * 3); // CÁLCULO PARA SORTEAR NÚMERO DE 1 A 3
            switch (resultado) {
                case 1 -> {
                    System.out.println("Desafiador " + desafiador.getNome() + " venceu!");
                    desafiador.vencer();
                    desafiado.perder();
                }
                case 2 -> {
                    System.out.println("Desafiado " + desafiado.getNome() + " venceu!");
                    desafiado.vencer();
                    desafiador.perder();
                }
                case 3 -> {
                    System.out.println("Os lutadores " + desafiador.getNome() + " e " + desafiado.getNome() + " empataram!");
                    desafiado.empatar();
                    desafiador.empatar();
                }
            }
        } else {
            System.out.println("A luta " + this.getNome()+ " nao pode acontecer pois os lutadores tem categorias incompativeis.");
        }
    }
   
}

