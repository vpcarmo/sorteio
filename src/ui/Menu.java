package ui;

import service.SorteioService;
import java.util.Scanner;

public class Menu {

    private SorteioService service = new SorteioService();
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE SORTEIO =====");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Sortear");
            System.out.println("4 - Ver sorteados");
            System.out.println("5 - Recolocar um nome sorteado");
            System.out.println("6 - Recolocar todos os sorteados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> adicionarNome();
                case 2 -> service.listarNomes();
                case 3 -> sortear();
                case 4 -> service.listarSorteados();
                case 5 -> recolocarUm();
                case 6 -> service.recolocarTodos();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private void adicionarNome() {
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        service.adicionarNome(nome);
    }

    private void sortear() {
        String resultado = service.sortear();
        System.out.println("Resultado: " + resultado);
    }

    private void recolocarUm() {
        System.out.print("Digite o nome para recolocar: ");
        String nome = sc.nextLine();
        boolean sucesso = service.recolocarUm(nome);
        if (sucesso) {
            System.out.println("Nome recolocado!");
        } else {
            System.out.println("Esse nome não está na lista de sorteados.");
        }
    }
}
