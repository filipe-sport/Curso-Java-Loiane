import java.util.Scanner;

public class Exerc34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Entre com um número inteiro: ");
        int num = scan.nextInt();
        
        boolean primo = true;
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                System.out.println("O número digitado não é primo!!!");
                primo = false;
                break;
            } 
        }
        if (primo){
            System.out.println("O numero é primo!!");
        }
    }
}
