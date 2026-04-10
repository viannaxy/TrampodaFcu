package model;

public class Musica {
    public String titulo;
    public String artista;
    public int duracaoSegundos;
    public String genero;

    public Musica(String titulo, String artista, int duracaoSegundos, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
        this.genero = genero;
    }

    public void exibir() {
        System.out.println(artista + " - " + titulo + " (" + genero + ")");
    }

    public boolean contemTitulo(String busca) {
        return titulo.toLowerCase().contains(busca);
    }

    public boolean contemArtista(String busca) {
        return artista.toLowerCase().contains(busca);
    }
}