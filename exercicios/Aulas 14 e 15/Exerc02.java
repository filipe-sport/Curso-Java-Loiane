import java.util.Scanner;
public class Exerc02 {
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       System.out.println("Entre com um numero: ");
       float num = scan.nextFloat();
       if (num > 0) {
           System.out.println("O numero eh positivo.");
       } else {
           System.out.println("O numero eh negativo.");
        }
    }
}