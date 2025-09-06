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
        while (fimTab < initTab){
            System.out.println("Entre novamente as informações: ");
            System.out.println("Começar por: ");
            initTab = scan.nextInt();
        System.out.println("Terminar em: ");
            fimTab = scan.nextInt();
        }
        for(int i = numTab ; initTab <= fimTab; initTab++){
            System.out.println(i + " x " + initTab + " = " + (numTab*initTab));
        }
    }
}
