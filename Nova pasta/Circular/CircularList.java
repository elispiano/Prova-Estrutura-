package Circular;
import java.util.Scanner;


class CircularList<T> {
    private No<T> inicio;
    private No<T> atual;

    public CircularList() {
        this.inicio = null;
        this.atual = null;
    }

    public void adicionar(T elemento) {
        No<T> novoNo = new No<>(elemento);

        if (inicio == null) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
            inicio = novoNo;
            inicio.setProximo(inicio);
            atual = inicio;
        } else {
            novoNo.setProximo(atual.getProximo());
            atual.setProximo(novoNo);
            atual = novoNo;
        }
    }

    public No<T> getNext() {
        if (atual == null) {
            return null;
        }

        No<T> proximo = atual.getProximo();
        atual = proximo;
        return proximo;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void listar(){
        CircularList<String> circularList = new CircularList<>();
        Scanner scanner = new Scanner(System.in);
        
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
}
}