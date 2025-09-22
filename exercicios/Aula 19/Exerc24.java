
import java.util.Scanner;

public class Exerc24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Entre com um número para a posção"+i);
            vetor[i] = scan.nextInt();
        }
        boolean palindromo = true;
        for (int i = 0; i < vetor.length/2; i++) {
            if(vetor[i] != vetor[vetor.length-1-i]){
                palindromo = false;
                break;
            }
        }
        if(palindromo){
            System.out.println("Palindromo!!");
        }else{
            System.out.println("Não é Palindromo!!");
        }
        
    }

    
}
