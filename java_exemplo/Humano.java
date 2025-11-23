package java_exemplo;

public class Humano extends SerVivo {

    public Humano(){
        super(20);
    }
    @Override
    public void respirar(){

        System.out.println("Inalando e expirando e tem idade: "+this.idade);
    }

}
