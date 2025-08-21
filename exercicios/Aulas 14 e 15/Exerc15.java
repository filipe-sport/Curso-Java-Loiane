import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro lado do triângulo: ");
        double lado1 = scan.nextDouble();
        System.out.println("Entre com o segundo lado do triângulo: ");
        double lado2 = scan.nextDouble();
        System.out.println("Entre com o terceiro lado do triângulo: ");
        double lado3 = scan.nextDouble();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("Os lados formam um triângulo.");
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
    }
}
