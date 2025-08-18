
import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com uma letra:");
        String letra = scan.nextLine().toUpperCase();
        // Verifica se a letra é uma vogal ou consoante
        if ("AEIOU".contains(letra)) {
            System.out.println("A letra informada é uma vogal.");
        } 
        else {
            System.out.println("A letra informada é uma consoante.");
        } 
    }
}

