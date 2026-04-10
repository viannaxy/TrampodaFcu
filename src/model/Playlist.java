package model;

import java.util.ArrayList;

public class Playlist {
    public String nome;
    public ArrayList<Musica> musicas = new ArrayList<>();

    public Playlist(String nome) {
        this.nome = nome;
    }

    public void adicionarMusica(Musica m) {
        musicas.add(m);
    }

    public void listarMusicas() {
        for (int i = 0; i < musicas.size(); i++) {
            System.out.print(i + " - ");
            musicas.get(i).exibir();
        }
    }
}