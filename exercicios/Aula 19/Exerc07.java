import java.util.Scanner;


public class Exerc07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[]vetorA = new int[10];
        int[]vetorB = new int[vetorA.length];
        int[]vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o vetor A na posição: " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o vetor B na posição: " + i);
            vetorB[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        

        System.out.print("Vetor A = ");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.print(vetorA[i] + " ");
            }
        System.out.print("\nVetor B = ");
            for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
            }
        System.out.print("\nVetor C = ");
            for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorC[i] + " ");
            }
    }
}

