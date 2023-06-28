package Fila;

public class Prioritaria<T> extends Fila<T>{

    public void toqueue(T element){
        Comparable<T> comparable = (Comparable<T>) element;

        int i;
        for( i=0; i<this.tamanho;i++){
            if(comparable.compareTo(this.elementos[i])<0){
                break;
            }
        }
        this.add(0,element);

    }
    
}
