package Fila;

public class Senha {
    private String name;
    private Boolean status;

    Fila<String> fila = new Fila<>();
    Fila<String> prioritaria = new Fila<>();


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }


    public void add (){
        if(getStatus() == true){
            addfila(prioritaria);
        }else{
            addfila(fila);
        }
       

    }

    String addfila(Fila<String> f){
        f.toqueue(this.getName());
        System.out.println("Agora voce está na fila");
        return null;
    }



    public void atender(){

         while(!fila.isEmpty()|| !prioritaria.isEmpty()){
            while(!prioritaria.isEmpty()){
             String person = prioritaria.unqueue();
             System.out.println(person + " Foi atendido (a)");
            }

            if(!fila.isEmpty()){
                String person = fila.unqueue();
                System.out.println(person + " Foi atendido (b)");
            }

            if(prioritaria.isEmpty()){
                while(!fila.isEmpty()){
                    String person = fila.unqueue();
                    System.out.println(person + " Foi atendido (c)");
                }
            }

        }
        
    }


    
    
}
