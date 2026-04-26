
package pkg9.pkg0.projeto_final;

public class Video implements Acoesvideo {
    
    // ATRIBUTOS
    
    private String titulo;
    protected int views;
    protected int likes;
    
    // CONSTRUTOR
    
    public Video(String titulo) {
        this.titulo = titulo;
        this.views = 0;
        this.likes = 0;
    }
    
    // GETTERS E SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    // METODOS HERDADOS
    
    @Override
    public void receberview() {
        this.setViews(++views);
    }
    
    @Override
    public void receberlike() {
        this.setLikes(++likes);
    }
    
    @Override
    public void status(){
        System.out.println("-----" + this.titulo + "-----");
        System.out.println("Views: " + this.getViews());
        System.out.println("Likes: " + this.getLikes());
        System.out.println("------------");
    }
    
}
