package Arvore;
import java.util.Scanner;

public class AvoreMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arvore arvore = new Arvore();
        int opcao;
                
            do {
                System.out.println("----------------Árvore de números---------------");
                System.out.println("||(1) - Adicionar número                      ||");
                System.out.println("||(2) - Pesquisa pré-fixada                   ||");
                System.out.println("||(3) - Pesquisa infixada                     ||");
                System.out.println("||(4) - Pesquisa pós-fixada                   ||");
                System.out.println("||(5) - Pesquisa em largura                   ||");
                System.out.println("||(6) - Mostrar caminhos(raíz até folhas)     ||");
                System.out.println("||(7) - Mostrar grau de parentesco            ||");
                System.out.println("||(8) - Mostrar folhas                        ||");
                System.out.println("||(9) - Quantidade de Nodes                   ||");
                System.out.println("||(10) - Voltar ao menu principal             ||");
                System.out.println("------------------------------------------------");
                    opcao = scanner.nextInt();

            switch (opcao) {
                        case 1:
                            System.out.println("+++++++++Adicionar número++++++++++");
                            System.out.println("\nDigite um numero:");
                            int numero = scanner.nextInt();
                            arvore.adicionar(numero);
                            break;

                        case 2:
                            System.out.println("++++++++++++Pesquisa pré-fixada+++++++++++++++");
                            arvore.pesquisaPreFixada();
                            break;

                        case 3:
                            System.out.println("+++++++++++Pesquisa infixada+++++++++++");
                            arvore.pesquisaInfixada();
                            break;

                        case 4:
                            System.out.println("+++++++Pesquisa pós-fixada+++++++\n");
                            arvore.pesquisaPosFixada();
                            break;

                        case 5:
                            System.out.println("++++++++Pesquisa em largura+++++++");
                            arvore.pesquisaEmLargura();
                            break;

                        case 6:
                            System.out.println("+Mostrar caminhos(raíz até folhas)+");
                            arvore.mostrarCaminhos();
                            break;

                        case 7:
                            System.out.println("+Mostrar grau de parentesco+");
                            int idPai = scanner.nextInt();
                            int idFilho = scanner.nextInt();
                            arvore.grauDeParentesco(idPai,idFilho);
                            break;

                        case 8:
                            System.out.println("+Mostrar folhas+");
                           arvore.mostrarFolhas();
                            break;

                        case 9:
                            System.out.println("+Quantidade de Nodes+");
                            arvore.mostrarQuantidadeElementos();
                            break;

                        case 10:
                            boolean continuar = true;
                            continuar = false;
                            break;

                        default:
                            throw new AssertionError();
                    }
        } while (opcao != 0);
    }
            

}
