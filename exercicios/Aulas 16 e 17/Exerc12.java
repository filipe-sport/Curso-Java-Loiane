import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("DDigite qual tabuada você quer: ");
        int num = scan.nextInt();
        System.out.println("Tabuada de " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
