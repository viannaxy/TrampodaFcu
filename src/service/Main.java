package service;

import model.*;
import java.util.Scanner;

public class Main {

    private Usuario user = new Usuario("User");
    private Playlist global = user.getPlaylist("Global");
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().iniciar();
    }

    public void iniciar() {
        int op;
        do {
            menu();
            op = Integer.parseInt(scanner.nextLine());
            processar(op);
        } while (op != 0);
    }

    private void menu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Cadastrar música");
        System.out.println("2. Listar músicas");
        System.out.println("3. Buscar por título");
        System.out.println("4. Criar playlist");
        System.out.println("5. Listar playlists");
        System.out.println("0. Sair");
        System.out.print("Escolha: ");
    }

    private void processar(int op) {
        switch (op) {
            case 1 -> cadastrar();
            case 2 -> global.listarMusicas();
            case 3 -> buscar();
            case 4 -> criarPlaylist();
            case 5 -> user.listarPlaylists();
            case 0 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida");
        }
    }

    private void cadastrar() {
        System.out.print("Titulo: ");
        String t = scanner.nextLine();

        System.out.print("Artista: ");
        String a = scanner.nextLine();

        System.out.print("Genero: ");
        String g = scanner.nextLine();

        System.out.print("Duração: ");
        int d = Integer.parseInt(scanner.nextLine());

        Musica m = new Musica(t, a, d, g);
        global.adicionarMusica(m);

        System.out.println("Cadastrado!");
    }

    private void buscar() {
        System.out.print("Buscar: ");
        String b = scanner.nextLine().toLowerCase();

        boolean encontrou = false;

        for (Musica m : global.getMusicas()) {
            if (m.contemTitulo(b)) {
                m.exibir();
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma música encontrada.");
        }
    }

    private void criarPlaylist() {
        System.out.print("Nome: ");
        user.criarPlaylist(scanner.nextLine());
        System.out.println("Playlist criada!");
    }
}