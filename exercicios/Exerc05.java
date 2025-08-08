import java.util.Scanner;
public class Exerc05 {
    public static void main(String[] args) {
        System.out.println("Digite a medida em metros:");
        Scanner metros = new Scanner (System.in);
        float medida = metros.nextFloat();
        float centimetros = medida * 100;
        System.out.println("A medida em centímetros é: " + centimetros);
        }
}
