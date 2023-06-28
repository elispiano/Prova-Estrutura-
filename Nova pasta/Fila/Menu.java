import java.util.Scanner;
import Fila.Senha;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Senha senha = new Senha();

    
    public void show(){
        int opt = 0;

        while (opt != 0) {

        System.out.println("==========MENU FILA============");
        System.out.println("1 - IMPRIMIR SENHA");
        System.out.println("2 - ATENDER PESSOAS");
        System.out.println("3 - Sair");
        System.out.println("==========TICKET IMETRO============");

        opt = scanner.nextInt();
        scanner.nextLine(); // fix error

        switch (opt) {
           case 1:
              insert();
              break;
            case 2:
            senha.atender();
            break;

            case 3:
              System.out.println("Desligando");
              break;
            
           default:
              System.out.println("Opção incorrecta.");
        }
     }

    }



    public void insert(){
        System.out.println("Seu Nome:");
        String name = scanner.nextLine();
        System.out.println("Digite 1 para boleiro e 0 caso nao:");
        int status = scanner.nextInt();

        if(status == 1){
            senha.setName(name);
            senha.setStatus(true);
            senha.add();
        }else{
            senha.setName(name);
            senha.setStatus(false);
            senha.add();
        }
    }


}

