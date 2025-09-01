
import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, contador, num;
        //Série de Fibonacci ate o n-esimo termo
        System.out.print("Digite a quantidade de termos: ");
        num = scan.nextInt();
        System.out.print(n1 + " " + n2);
        for (contador = 2; contador < num; contador++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }        
    }
}
