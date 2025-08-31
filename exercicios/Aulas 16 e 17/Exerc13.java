
import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Entre com a base da exponenciação");
        int base = scan.nextInt();
        System.out.println("Entre com o expoente da exponenciação");
        int expoente = scan.nextInt();
        if (expoente == 0) {
            System.out.println("O resultado de " + base + " elevado a " + expoente + " é: 1");
        }
         else{
             for (int i = base; i <= expoente; i++) {
                 int resultado = base *expoente;
                 System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
             }
         }
    }
}