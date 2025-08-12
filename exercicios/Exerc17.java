import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a área a ser pintada em metros quadrados? ");
        float area = scan.nextFloat();
        // Cálculo da quantidade de tinta necessária
        float litrosTinta = area / 6;
        System.out.printf("Quantidade de tinta necessária: %.2f litros%n", litrosTinta);
        // Cálculo de tinta considerando que cada lata cobre 18 litros
        int latas = (int) Math.ceil(litrosTinta / 18);
        System.out.printf("Quantidade de latas de tinta necessárias: %d%n", latas);
        // Cálculo de tinta considerando que cada galão cobre 3,6 litros
        int galoes = (int) Math.ceil(litrosTinta / 3.6);
        System.out.printf("Quantidade de galões de tinta necessárias: %d%n", galoes);
        // Cálculo misturando latas e galões considerando o menor preço
    }
}
