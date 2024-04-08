import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número interio: ");
        int num = sc.nextInt();

        comparador(num);

        sc.close();
    }


    public static void comparador(int numero) {
        if(numero >= 0){
            System.out.println("Número positivo!");
        }else{
            System.out.println("Número negativo!");
        }
    }
}
