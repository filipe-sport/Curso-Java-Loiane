import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scan.nextInt();
        
        for (int i = num1 + 1 ; i < num2; i++) {
            System.out.print(i + ", ");
        }
    }
}
