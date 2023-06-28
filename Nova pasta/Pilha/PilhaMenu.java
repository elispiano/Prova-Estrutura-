
import java.util.Scanner;

public class PilhaMenu {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
                    System.out.println("-------------Empilhamento de livros-------------");
                    System.out.println("||(1) - Adicionar livro a pilha               ||");
                    System.out.println("||(2) - Remover livro desejado                ||");
                    System.out.println("||(3) - Remover livro da normalmente          ||");
                    System.out.println("||(4) - Consultar livro por id                ||");
                    System.out.println("||(5) - Empilhar livros                       ||");
                    System.out.println("||(6) - Mostrar quantidade de livros          ||");
                    System.out.println("||(7) - Mostrar topo da pilha de livros       ||");
                    System.out.println("||(8) - Mostrar base da pilha de livros       ||");
                    System.out.println("||(9) - Desempilhar livros                    ||");
                    System.out.println("||(10) - Voltar ao menu principal              ||");
                    System.out.println("------------------------------------------------");
                    opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("++++Adicionar livro a pilha+++++");
                    System.out.println("\nDigite o nome do livro:");
                    String nome = scanner.next();
                    pilha.adicionar(nome);
                    break;

                    case 2:
                    System.out.println("++++++++Remover livro desejado++++++++++++");
                    System.out.println("\nDigite o ID do livro a ser removido:");
                    int idRemover = scanner.nextInt();
                    pilha.removerPorId(idRemover);
                    break;

                    case 3:
                        System.out.println("++++++++Remover livro normalmente++++++++");
                        pilha.remover();
                        break;

                    case 4:
                        System.out.println("++++++++++Consultar livro por id+++++++++");
                        System.out.println("\nInsira o id do livro que pretende ver: ");
                        int id = scanner.nextInt();
                        pilha.consultarPorId(id);
                        break;

                    case 5:
                        System.out.println("++++++++Empilhar livros+++++++");
                        pilha.imprimirPilha();
                        break;

                    case 6:
                        System.out.println("+Mostrar quantidade de livros+");
                        pilha.mostrarQuantidadeElementos();
                    break;

                    case 7:
                        System.out.println("+Mostrar topo da pilha de livros+");
                        pilha.mostrarTopo();
                    break;

                    case 8:
                        System.out.println("+Mostrar base da pilha de livros+");
                        pilha.mostrarBase();
                    break;

                        case 9:
                        System.out.println("Desempilhando livros...");
                        while (pilha.remover()) {
                            // Realiza o desempilhamento contínuo até a pilha ficar vazia
                        }
                        break;

                        case 10:
                            boolean continuar = true;
                            continuar = false;
                            break;

                        default:
                            throw new AssertionError();
            }
        } while (opcao != 0);

        scanner.close();
    }
}
