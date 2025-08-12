import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos metros quadrados de tinta serão necessários para pintar a parede?  ");
        float metrosQuadrados = scan.nextFloat();
        // Cálculo da quantidade de tinta necessária
        float litrosTinta = metrosQuadrados / 3;
        System.out.printf("Litros de tinta necessários: %.2f litros%n", litrosTinta);
        // Cálculo da quantidade de latas necessárias (cada lata contém 18 litros)
        int latasNecessarias = (int) Math.ceil(litrosTinta / 18);
        System.out.printf("Latas de tinta necessárias: %d latas%n", latasNecessarias);
        // Cálculo do custo total
        float custoTotal = latasNecessarias * 80.0f;
        System.out.printf("Custo total: R$ %.2f%n", custoTotal);
    }
}
