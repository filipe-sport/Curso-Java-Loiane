import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo número inteiro: ");
        int num2 = scan.nextInt();
        System.out.println("Entre com um número real:");
        float num3 = scan.nextFloat();
        float resultado1 = (num1 *2) * (num2/2);
        float resultado2 = (num1 * 3) + num3;
        float resultado3 = (num3 * num3 * num3);
        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado1);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2);
        System.out.println("O terceiro elevado ao cubo é: " + resultado3);
    }
}
