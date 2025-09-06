import java.util.Scanner;

public class Exerc35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Entre com um número inteiro");
        int num = scan.nextInt();
        

        for (int i = 2; i <= num; i++){
            
            int j = i;
            int cont = 0;
            while (j>=1){
               
                if(i % j == 0){
                    cont++;
                }
                j--;
            }
            if(cont == 2){
                    System.out.println(i + " é primo");
            }
        }
        }
    }
