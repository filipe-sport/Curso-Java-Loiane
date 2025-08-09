import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um lado do quadrado:");
        Float lado = scan.nextFloat();
        Float area = lado * lado;
        System.out.println("O dobro da área do quadrado é: " + (area * 2));
    }
}
