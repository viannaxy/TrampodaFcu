package model;

import java.util.ArrayList;

public class Usuario {

    private String nome;
    private ArrayList<Playlist> playlists;

    public Usuario() {
        this("Usuário");
    }

    public Usuario(String nome) {
        setNome(nome);
        this.playlists = new ArrayList<>();
        this.playlists.add(new Playlist("Global"));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            this.nome = "Usuário";
        } else {
            this.nome = nome;
        }
    }

    public void criarPlaylist(String nome) {
        playlists.add(new Playlist(nome));
    }

    public Playlist getPlaylist(String nome) {
        for (Playlist p : playlists) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void listarPlaylists() {
        for (Playlist p : playlists) {
            System.out.println("- " + p.getNome());
        }
    }
}