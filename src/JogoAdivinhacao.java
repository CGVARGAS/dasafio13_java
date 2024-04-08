import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(4);

        System.out.print("Informe um número inteiro: ");
        int numero = sc.nextInt();

        while(numeroAleatorio != numero){
            System.out.printf("O número %d não é o número sorteado!\n", numero);
            System.out.print("Informe um número inteiro: ");
            numero = sc.nextInt();

        }
        System.out.println("Você acertou o número sorteado!");

        sc.close();
    }

}
