
import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        
        int i = 0;
        int maior = 0;        
        Scanner scan = new Scanner(System.in);
         while(i < 5){
            System.out.println("Digite um numero: ");
            int num = scan.nextInt();
            if(num > maior){
                maior = num;
            }
            i++;
         }
            
        System.out.println("O maior numero digitado foi: " + maior);
    }
    
}
