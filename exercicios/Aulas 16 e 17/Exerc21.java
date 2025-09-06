
import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        System.out.println("Digite um numero inteiro: ");
        int num = scan.nextInt();
        if(num < 2){
            System.out.println("O numero " + num + " não é primo! ");
        }
        //Para numeros maiores que 2
        //Verifica se é divisivel por algum numero entre 2 e ele mesmo
        boolean primo = true;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                cont++;
            }
        }
        if (cont == 2){            
         System.out.println("O numero " + num + " é primo! ");
        }else {
            System.out.println("O número "+ num +" não é primo!!!");
        }     
    }              
}
    

