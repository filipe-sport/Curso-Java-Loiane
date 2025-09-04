
import java.util.Scanner;

public class Exerc32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Entre com o número que deseja fatorial: ");
        
        
        int num = scan.nextInt();
        int fatorial = 1;
        System.out.println("Fatorial de: "+ num);
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
