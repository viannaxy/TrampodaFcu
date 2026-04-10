package model;

import java.util.ArrayList;

public class Usuario {
    public String nome;
    public ArrayList<Playlist> playlists = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
        playlists.add(new Playlist("Global"));
    }

    public void criarPlaylist(String nome) {
        playlists.add(new Playlist(nome));
    }

    public Playlist getPlaylist(String nome) {
        for (Playlist p : playlists) {
            if (p.nome.equals(nome)) return p;
        }
        return null;
    }

    public void listarPlaylists() {
        for (Playlist p : playlists) {
            System.out.println("- " + p.nome);
        }
    }
}