
import java.util.Scanner;

public class Exerc23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = scan.nextDouble();
        if (numero % 1 == 0) {
            System.out.println("O número " + String.format("%.0f", numero) + " é inteiro.");
        } else {
            System.out.println("O número " + String.valueOf(numero).replace(".", ",") + " é decimal.");
        }
    }
}
