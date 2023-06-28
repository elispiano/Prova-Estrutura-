import java.util.Scanner;
import Arvore.AvoreMain;
import Base.Menu;
import Circular.MainCircular;


public class MenuPrincipal {
    public static void main(String[] args) {
        AvoreMain arvore = new AvoreMain();
        Scanner scanner = new Scanner(System.in);
        MainCircular circular = new MainCircular();
        PilhaMenu pilha = new PilhaMenu();
        
        Menu filaMenu = new Menu();

        int opcao;

        do {
            System.out.println("-----BEM-VINDO---ESCOLHA UMA OPCÃO------:");
            System.out.println("1 - Fila");
            System.out.println("2 - Pilha");
            System.out.println("3 - Lista Circular");
            System.out.println("4 - Árvore Binaria");
            System.out.println("5 - Grafos");
            System.out.println("0---------------Sair----------------------");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    filaMenu.show();
                    break;
                case 2:
                    pilha.main(args);
                case 3:
                    circular.main(args);
                    break;
                case 4:
                    arvore.main(args);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
