import java.util.Scanner;

public class Exerc25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Telefonou para a vítima? (s/n)");
        String resp1 = scan.next();
        System.out.println("Esteve no local do crime? (s/n)");
        String resp2 = scan.next();
        System.out.println("Mora perto da vítima? (s/n)");
        String resp3 = scan.next();
        System.out.println("Devia para a vítima? (s/n)");
        String resp4 = scan.next();
        System.out.println("Já trabalhou com a vítima? (s/n)");
        String resp5 = scan.next();
        int count = 0;
        if (resp1.equalsIgnoreCase("s")) {
            count++;
        }
        if (resp2.equalsIgnoreCase("s")) {
            count++;
        }
        if (resp3.equalsIgnoreCase("s")) {
            count++;
        }
        if (resp4.equalsIgnoreCase("s")) {
            count++;
        }
        if (resp5.equalsIgnoreCase("s")) {
            count++;
        }
        if (count == 5) {
            System.out.println("Assassino");
        } else if (count >= 3) {
            System.out.println("Cúmplice");
        } else if (count == 2) {
            System.out.println("Suspeita");
        } else {
            System.out.println("Inocente");
        }
    }
}