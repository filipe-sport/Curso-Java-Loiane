import java.util.Scanner;

public class Exerc22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        int num = scan.nextInt();
        int i = 2;
        while ( i < num){
            if (num % i != 0) {
                System.out.println("primo");
                break;
            }else{
                while (i < num){
               if (num % i == 0){
                   System.out.println("O numero "+ num + " é divisível por "+i);
               }
               i++;               
               }
            }
            i++;
            }
        }
                
    }    