import java.util.Scanner;

/**
 * A classe Exercicio02 solicita dois números inteiros ao usuário e compara-os.
 */
public class Exercicio02 {

    /**
     * Método principal que solicita dois números ao usuário e chama o método de comparação.
     * @param args argumentos da linha de comando (não utilizados neste programa)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = sc.nextInt();

        comparador(num1, num2);
        sc.close();
    }

    /**
     * Compara dois números inteiros e imprime uma mensagem indicando se são iguais ou diferentes.
     * @param num1 o primeiro número inteiro a ser comparado
     * @param num2 o segundo número inteiro a ser comparado
     */
    public static void comparador(int num1, int num2) {
        if (num1 > num2) {
            System.out.printf("Os números são diferentes e %d é maior que %d", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("Os números são diferentes e %d é menor que %d", num1, num2);
        } else {
            System.out.println("Os números são iguais!");
        }
    }
}

