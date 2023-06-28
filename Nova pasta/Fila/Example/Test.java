package Example;

import Fila.Fila;

public class Test {
    
    public static void main(String[] args) throws Exception {
       Fila<String> fila = new Fila<>();

       fila.toqueue("Edgar");
       fila.toqueue("Recik");
       fila.toqueue("Kendro");

       System.out.println(fila.ShowFirst());
       System.out.println(fila.toString());
       fila.unqueue();
       System.out.println(fila.ShowFirst());
       System.out.println(fila.toString());

     }
}
