import java.util.Scanner;

public class Exerc02 {
public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int[]vetorA = new int[8];
    int[]vetorB = new int[vetorA.length];
    for (int i = 0; i < vetorA.length; i++) {
        System.out.println("Entre com o vetor na posição: " + i);
        vetorA[i] = scan.nextInt();
        vetorB[i] = 2 * vetorA[i];
    }

    System.out.print("Vetor A = ");
    for (int i = 0; i < vetorA.length; i++) {
        System.out.print(vetorA[i] + " ");
    }
    System.out.print("\nVetor B = ");
    for (int i = 0; i < vetorA.length; i++) {
        System.out.print(vetorB[i] + " ");
    }

}
}
