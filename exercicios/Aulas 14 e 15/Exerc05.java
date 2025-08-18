
import java.util.Scanner;



public class Exerc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a primeira nota: ");
        float nota1 = scan.nextFloat();
        System.out.println("Entre com a segunda nota: ");
        float nota2 = scan.nextFloat();
        float media = (nota1 + nota2) / 2;
        if (media==100){
            System.out.println("Aprovado com distinção");
        } else if (media >=70 && media < 100){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
