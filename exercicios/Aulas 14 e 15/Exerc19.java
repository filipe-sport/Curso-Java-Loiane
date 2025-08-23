import java.util.Scanner;

public class Exerc19{
    public static void main(String[] args) {
        System.out.println("Entre com um numero até 1000: ");
        Scanner scan = new Scanner (System.in);
        int numero = scan.nextInt();
        if (numero < 1 || numero > 1000) {
            System.out.println("Número inválido! Digite um número entre 1 e 1000.");
        } else {
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = numero % 10;
            System.out.println("O número informado tem: "+centenas+" centenas, "+dezenas+" dezenas e "+unidades+" unidades.");
        }
    }
}