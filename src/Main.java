import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int id;
        String registro;
        String cor;
        String tipo;
        int capacidade;
        double tamanho;
        double peso;
        String porte;
        double valor;


           tamanho = 100.0;
           peso = 50.0;
           capacidade = 4;
           valor = 300.0;

           Balao b1 = new Balao();

           String resultado = b1.voar();

        System.out.println(resultado);



        System.out.println("Seu numero de registro");


        Random random = new Random();
        int numeroAleatorio = random.nextInt(); // Gera um número aleatório de 32 bits
        System.out.println("ID: " + numeroAleatorio);
    }
}










