
import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num = scan.nextInt();
        //Verificação numero primo
        boolean primo = true;
        if(num < 2){
            System.out.println("O numero " + num + " não é primo! ");
        }
        //Para numeros maiores que 2
        //Verifica se é divisivel por algum numero entre 2 e ele mesmo
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                primo = false;
                System.out.println("O numero " + num + " não é primo! ");
                break;
            }
            else{
                primo = true;
                System.out.println("O numero " + num + " é primo! ");
                break;
            }
            
                   
        }
    }
}
