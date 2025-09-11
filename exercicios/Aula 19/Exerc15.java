
import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetor = new double[10];
        double contPar = 0, contImpar = 0, percentualImpar = 0, percentualPar = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Entre com o vetor na posição: "+i);
            vetor[i] = scan.nextInt();

            if(vetor[i] % 2 == 0){
                contPar++;
            }
            else{
                contImpar++;
            }
        
        }
        percentualPar = (contPar/vetor.length)*100;
        percentualImpar = (contImpar/vetor.length*100);

        System.out.println("O percentual de números Pares é de: "+percentualPar+" e o de Impares é de: "+percentualImpar);
        
    }
}
