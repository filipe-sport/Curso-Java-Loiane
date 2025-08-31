
import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int contador = 1;
        int quantPares = 0;
        int quantImpares = 0;
        do { 
            System.out.println("Entre com um número inteiro ("+contador+"/10): ");
            int num = scan.nextInt();
            if(num % 2 == 0){
                quantPares++;
            }
            else{
                quantImpares++;
            }
        } while (contador++ < 10);
        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números ímpares: " + quantImpares);
    }
}
