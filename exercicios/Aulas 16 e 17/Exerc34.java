import java.util.Scanner;

public class Exerc34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int cont = 0;
        System.out.println("Entre com um número inteiro: ");
        int num = scan.nextInt();
        
        boolean primo = true;
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                cont++;
            } 
        }
        if (cont == 2){
            System.out.println("O numero é primo!!");
        }else {
            System.out.println("O numero não é primo!");
        }
    }
}
