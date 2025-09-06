import java.util.Scanner;

public class Exerc36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Montar a tabuada de: ");
        int numTab = scan.nextInt();
        System.out.println("Começar por: ");
        int initTab = scan.nextInt();
        System.out.println("Terminar em: ");
        int fimTab = scan.nextInt();

        for(int i = initTab; initTab <= fimTab; initTab++){
            System.out.println(numTab+ " x " + initTab + " = " + (numTab*initTab));
        }
    }
}
