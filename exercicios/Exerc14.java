
import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a quantidade de pedo do peixe:");
        float peso = scan.nextFloat();
        if (peso < 50) {
            System.out.println("Não há excesso de peso.");
        } else {
            float excesso = peso - 50;
            float multa = excesso * 4.0f;
            System.out.printf("Excesso de peso: %.2f kg%n", excesso);
            System.out.printf("Multa a pagar: R$ %.2f%n", multa);
        }
    }
}