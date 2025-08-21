
import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor de a:");
        double a = scan.nextDouble();
        System.out.println("Entre com o valor de b:");
        double b = scan.nextDouble();
        System.out.println("Entre com o valor de c:");
        double c = scan.nextDouble();
        if (a == 0) {
            System.out.println("O valor de 'a' é igual a zero, logo ela não é uma função do segundo grau.");
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("As raízes da equação são: %.2f e %.2f%n", raiz1, raiz2);
        }
    }
}
