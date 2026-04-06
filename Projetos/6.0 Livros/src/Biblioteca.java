public class Biblioteca {
    public static void main (String [] args) {
    Livro livros[] = new Livro[2];
    Pessoa pessoas[] = new Pessoa[2];
            
    pessoas[0] = new Pessoa("Arthur Cosmo", 23, "Masculino");
    pessoas[1] = new Pessoa("Guibson Fernando", 47, "Masculino");
    
    livros[0] = new Livro("A bela e a fera", "Gilda veronica", 300, pessoas[0]);
    livros[1] = new Livro("Zac Power", "Bethesda", 65, pessoas[1]);
    
    livros[0].folhear(30);
    livros[1].folhear(800);
    
    livros[0].detalhes();
    livros[1].detalhes();
    }    
}
