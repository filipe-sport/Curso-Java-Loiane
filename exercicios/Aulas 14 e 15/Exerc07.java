
import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo número: ");
        int num2 = scan.nextInt();
        System.out.println("Entre com o terceiro número: ");
        int num3 = scan.nextInt();

         // Verifica o maior número
        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }       

        // Verifica o menor número
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
