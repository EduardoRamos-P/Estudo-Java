package java_exemplo;

public abstract class SerVivo {
    public abstract void respirar();

    protected int idade; 

    public SerVivo(int idade){
        this.idade = idade;
    }

    public void dormir(){
        System.out.println("Dormindo");
    }
}
