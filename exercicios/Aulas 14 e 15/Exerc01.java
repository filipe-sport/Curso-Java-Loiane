import java.util.Scanner;

public class Exerc01 {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    System.out.println("Entre com o primeiro numero: ");
    float num1 = scan.nextFloat();
    System.out.println("Entre com o segundo numero: ");
    float num2 = scan.nextFloat();
    if (num1 > num2) {
        System.out.println("O maior numero eh: " + num1);
    } else if (num2 > num1) {
        System.out.println("O maior numero eh: " + num2);
    } 
    }
}