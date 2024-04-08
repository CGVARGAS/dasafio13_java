public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento > 2022) {
            System.out.println("Ano de lançamento que os clientes estão curtindo: Filme lançado após 2022");
        } else {
            System.out.println("Ano de lançamento que os clientes estão curtindo: Filme lançado em 2022 ou antes");
        }

        if(incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Você deve pagar pela locação!");
        }
    }
}

