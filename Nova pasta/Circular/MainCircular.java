package Circular;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCircular {
    public static void main(String[] args) {
        CircularList<String> circularList = new CircularList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Mês");
            System.out.println("2. Ver Meses");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do mês: ");
                    String mes = scanner.nextLine();
                    circularList.adicionar(mes);
                    System.out.println("Mês adicionado com sucesso!");
                    System.out.println();
                    break;
                case 2:
                    if (circularList.isEmpty()) {
                        System.out.println("Nenhum mês adicionado ainda.");
                        System.out.println();
                    } else {
                        System.out.println("Pressione Enter para avançar para o próximo mês (ou digite 'sair' para voltar ao menu):");
                        System.out.println();
                        No<String> noAtual = circularList.getNext();
                        int count = 1;
                        String input;
                        do {
                            System.out.println(count + ". " + noAtual.getElemento());
                            input = scanner.nextLine();
                            if (input.equalsIgnoreCase("sair")) {
                                break;
                            }
                            noAtual = circularList.getNext();
                            count++;
                        } while (true);
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println();
            }
        } while (opcao != 0);

        scanner.close();
    }
}