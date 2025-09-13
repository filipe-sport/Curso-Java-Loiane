
import java.util.Scanner;

public class Exerc22 {
public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    double contUno = 0, contZero = 0;
    int[] vetorA = new int[10];
    for (int i = 0; i < vetorA.length; i++) {
        vetorA[i] = (int)Math.round(Math.random()*1);
       
    }
    for (int i = 0; i < vetorA.length; i++) {
         if(vetorA[i] == 0){
            contZero++;
        }
        if(vetorA[i] == 1){
            contUno++;
        }
    }
    System.out.println("O percentual de 0 é de "+ ((contZero/vetorA.length)*100)+"% e percentuais de 1 é de: "+ ((contUno/vetorA.length)*100)+"%");
}
}
