
import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        //Calculo do fatorial
        int num = scan.nextInt();
        int fatorial = 1;
        System.out.print(num + "! = ");
        for(int i = num; i >= 1; i--){
            fatorial = fatorial * i;
            if(i != 1){
                System.out.print(i + " x ");
            }else{
                System.out.print(i + " = ");
            }
        }
        System.out.println(fatorial);
    }
}
