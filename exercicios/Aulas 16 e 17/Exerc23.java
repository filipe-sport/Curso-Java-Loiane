import java.util.Scanner;

public class Exerc23 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        int num = scan.nextInt();
        int i = 2;
        int cont = 0;
        if (num < 2 ){
            System.out.println("O número " + num + "não é primo!");
        }else{
            while ( i < num){
                if (num % i != 0) {
                    System.out.println("primo");
                    break;
                }else{
                    while (i < num){
                   if (num % i == 0){
                       System.out.println("O numero "+ num + " é divisível por "+i);
                       cont++; 
                   }
                   i++; 
                                
                   }
                }
                i++;
            }
        }
        System.out.println("O número de divisões efetuadas foi: " + cont);
    }
}
