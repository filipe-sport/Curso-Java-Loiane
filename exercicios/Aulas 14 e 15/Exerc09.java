import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro numero: ");    
        double numero1 = scan.nextDouble();
        System.out.println("Digite o valor do segundo numero: ");
        double numero2 = scan.nextDouble();
        System.out.println("Digite o valor do terceiro numero: ");
        double numero3 = scan.nextDouble();
       if(numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println("A ordem decrescente é: " + numero1 + ", " + numero2 + ", " + numero3);
        } else if (numero1 > numero3 && numero1 > numero2 && numero3 > numero2) {
            System.out.println("A ordem decrescente é: " + numero1 + ", " + numero3 + ", " + numero2);
        } else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
            System.out.println("A ordem decrescente é: " + numero2 + ", " + numero1 + ", " + numero3);
        } else if (numero2 > numero3 && numero2 > numero1 && numero3 > numero1) {
            System.out.println("A ordem decrescente é: " + numero2 + ", " + numero3 + ", " + numero1);
        } else if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
            System.out.println("A ordem decrescente é: " + numero3 + ", " + numero1 + ", " + numero2);
        } else {
            System.out.println("A ordem decrescente é: " + numero3 + ", " + numero2 + ", " + numero1);
        }
    }
}
