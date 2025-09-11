import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];
        int soma = 0, cont = 0, media = 0;

        for(int i = 0; i < VetorA.length; i++){
            System.out.println("Entre com um numero na posição "+i+" :");
            VetorA[i] = scan.nextInt();
            if(VetorA[i] % 2 != 0){
                soma += VetorA[i];
                cont++;
            }
        }
        media = soma / cont;
        System.out.println("A média aritmética simples dos elementos ímpares armazenados neste vetor é: "+media);

    }
}
