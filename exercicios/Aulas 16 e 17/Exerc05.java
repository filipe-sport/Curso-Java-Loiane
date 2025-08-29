import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Entre com a população de A: ");
        double populacaoA = scan.nextDouble();
        System.out.println("Entre coma população de B: ");
        double populacaoB = scan.nextDouble();
        System.out.println("Entre com a taxa de crescimento de A (%): ");
        double crescimentoA = scan.nextDouble() / 100;
        System.out.println("Entre com a taxa de crescimento de B (%): ");
        double crescimentoB = scan.nextDouble() / 100;
        int anos = 0;
        while (populacaoB >= populacaoA) {
            populacaoA += populacaoA * crescimentoA;
            populacaoB += populacaoB * crescimentoB;
            anos++;
        }
        System.out.println("A população A ultrapassará a população B em " + anos + " anos.");

    }
}
