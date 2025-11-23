package java_exemplo;

public class PrimeiroPrograma {


    public static void main(String[] args) {
        Carro Carro1 = new Sandero();
        Carro1.acelerar();
        Carro Carro2 = new Fusca();
        Carro2.acelerar();

        SerVivo meuser = new Humano();
        meuser.respirar();

    }
}

// public - acessível em qualquer lugar
// default - acessível apenas no mesmo diretório
// private - acessível somente para a própria classe
// protected - acessível para a classe, a subclasses e a arquivos em mesmo diretório 