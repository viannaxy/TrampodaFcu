package model;

public class Musica {

    private String titulo;
    private String artista;
    private int duracaoSegundos;
    private String genero;

    public Musica() {
        this("Sem título", "Desconhecido", 0, "Indefinido");
    }

    public Musica(String titulo, String artista, int duracaoSegundos, String genero) {
        setTitulo(titulo);
        setArtista(artista);
        setDuracaoSegundos(duracaoSegundos);
        setGenero(genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            this.titulo = "Sem título";
        } else {
            this.titulo = titulo;
        }
    }

    public void setArtista(String artista) {
        if (artista == null || artista.isBlank()) {
            this.artista = "Desconhecido";
        } else {
            this.artista = artista;
        }
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        if (duracaoSegundos < 0) {
            this.duracaoSegundos = 0;
        } else {
            this.duracaoSegundos = duracaoSegundos;
        }
    }

    public void setGenero(String genero) {
        if (genero == null || genero.isBlank()) {
            this.genero = "Indefinido";
        } else {
            this.genero = genero;
        }
    }

    public void exibir() {
        System.out.println(artista + " - " + titulo + " (" + genero + ")");
    }

    public boolean contemTitulo(String busca) {
        return titulo.toLowerCase().contains(busca.toLowerCase());
    }

    public boolean contemArtista(String busca) {
        return artista.toLowerCase().contains(busca.toLowerCase());
    }
}