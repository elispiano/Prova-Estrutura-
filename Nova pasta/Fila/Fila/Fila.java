package Fila;

import struct.StaticStruct;

public class Fila<T> extends StaticStruct<T> {

    public Fila(){
       super();
    }

    public Fila (int cp){
        super(cp);
    }

    public void toqueue(T elemento){
        this.add(elemento);
    }

    public T ShowFirst(){
        if (this.isEmpty())
            return (T) "Empty";
        return this.elementos[0];
    }

    public T unqueue (){
        if (this.isEmpty())
            return (T) "Empty";
        
        T toremove = elementos[0];
        this.remove(0);
        return toremove;
    }

}