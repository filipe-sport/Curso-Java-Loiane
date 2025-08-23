
import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        int valor = scan.nextInt();
        if (valor < 10 || valor > 600) {
            System.out.println("Valor inválido para saque. O valor mínimo é R$10.");
        } else {
            int notas100 = valor / 100;
            int resto = valor % 100;
            int notas50 = resto / 50;
            resto = resto % 50;
            int notas10 = resto / 10;
            resto = resto % 10;
            int notas5 = resto / 5;
            resto = resto % 5;
            int notas1 = resto / 1;
            System.out.println("Notas de R$100: " + notas100);
            System.out.println("Notas de R$50: " + notas50);
            System.out.println("Notas de R$10: " + notas10);
            System.out.println("Notas de R$5: " + notas5);
            System.out.println("Notas de R$1: " + notas1);
        }
    }
}
