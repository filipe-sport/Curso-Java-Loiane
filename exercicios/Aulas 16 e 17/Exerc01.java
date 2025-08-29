import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com um numero entre 0 e 10: ");
        int num = scan.nextInt();
        while (num < 0 || num > 10) {
            System.out.print("Numero invalido! Entre com um numero entre 0 e 10: ");
            num = scan.nextInt();
        }
        System.out.println("Numero valido: " + num);
    }
}
