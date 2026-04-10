package model;

import java.util.ArrayList;

public class Playlist {

    private String nome;
    private ArrayList<Musica> musicas;

    public Playlist() {
        this("Sem nome");
    }

    public Playlist(String nome) {
        setNome(nome);
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            this.nome = "Sem nome";
        } else {
            this.nome = nome;
        }
    }

    public void adicionarMusica(Musica m) {
        if (m != null) {
            musicas.add(m);
        }
    }

    public void listarMusicas() {
        if (musicas.isEmpty()) {
            System.out.println("Playlist vazia");
            return;
        }

        for (int i = 0; i < musicas.size(); i++) {
            System.out.print(i + " - ");
            musicas.get(i).exibir();
        }
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }
}