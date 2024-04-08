import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String ler = leitura.nextLine();

        System.out.println(ler);

        leitura.close();
    }
}
