
import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro produto: ");    
        double produto1 = scan.nextDouble();
        System.out.println("Digite o valor do segundo produto: ");
        double produto2 = scan.nextDouble();
        System.out.println("Digite o valor do terceiro produto: ");
        double produto3 = scan.nextDouble();
        double menorPreco = produto1;

        // Verifica qual produto tem o menor preço
        if (produto2 < menorPreco) {
            menorPreco = produto2;
        }
        if (produto3 < menorPreco) {
            menorPreco = produto3;
        }

        // Exibe o produto mais barato

        if (menorPreco == produto1) {
            System.out.println("O primeiro produto é o mais barato: " + menorPreco);
        } else if (menorPreco == produto2) {
            System.out.println("O segundo produto é o mais barato: " + menorPreco);
        } else {
            System.out.println("O terceiro produto é o mais barato: " + menorPreco);
        }
    }
}
