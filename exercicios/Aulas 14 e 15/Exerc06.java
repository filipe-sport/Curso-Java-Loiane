
import java.util.Scanner;



public class Exerc06 {
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
        else{
            System.out.println("O maior número é: " + maior);
        }
    }
}
