import java.util.Scanner;


public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[]vetorA = new int[15];
        float[]vetorB = new float[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o vetor na posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = (float) Math.sqrt(vetorA[i]);
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
