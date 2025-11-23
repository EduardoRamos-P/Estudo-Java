import java.util.ArrayList;

public class Main {
    //Declaração de variável:
    //tipo nome = valor;
    int minhaIdade = 18;
    String Nome = "Eduardo";
    public static void main(String[] args) {
        //tipos de variáveis 1° = Int(Números Inteiros);
            //byte minhaVar => 8 bits => -128 a 127
            //short minhaVar => 16 bits => -32.768 a 32.767
            //int minhaVar => 32 bits => -2.147.483.648 a 2.147.483.647
            //long minha Var => 64 bits => -9.223.372.836.854.775.808 a 9.223.372.036.854.775.807
        //2° = Float(Números Decimais);
            // float minhaVar => 32 bits => precisão simples
            // double minhaVar => 64 bits => precisão dupla
        //3° String(Frases);
            // String minhaVar => representar palavras e/ou frases = "meu amigo é legal"
            // char minhaVar => representar um único caracter = 'a', '/', '%' e etc.
        //4° Boll(True/False) => Verdadeiro ou Falso;
        byte a = 100;
        short b = 10000;
        int c = 1000000;
        long d = 100000000000L;
        float e = 10.5f;
        double f = 20.5;
        char g = 'B';
        String h = "Amiglo legal";
        boolean i = false;

        if(i){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }

        if(a > 99){
            System.out.println("'a' é maior que 99");
        }else{
            System.out.println("'a' é menor que 99");
        }

        if(h.isBlank()){
            System.out.println("'h' está vazio");
        }else{
            System.out.println("'h' não está vazio");
        }

        int[] colecaoDeInteiros = {1, 2, 3, 4, 5};
        //vários tipos de array como: bool, String ou Float
        String[] AlgunsNomes = new String[5];
        //array vazio com 5 espaços
        AlgunsNomes[0] = "Dudu";
        
        System.out.println("posição 0 é "+colecaoDeInteiros[2]);
        System.out.println("posição 0 é "+colecaoDeInteiros.length);

        ArrayList<String> Nomes = new ArrayList<>();
        Nomes.add("Eduardo");
        Nomes.add("Maria");
        Nomes.add("Henrique");

        System.out.println(Nomes.get(0));
        Nomes.remove(0);
        System.out.println(Nomes.get(0));

        for(int cont = 0; cont <= Nomes.size(); cont++){
            System.out.println(Nomes.get(cont));
        }

        int novo_cont = 0;
        while (novo_cont <= AlgunsNomes.length) {
            System.out.println(AlgunsNomes[novo_cont]);
            novo_cont++;   
        }
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuInt2);
        


    }
}
