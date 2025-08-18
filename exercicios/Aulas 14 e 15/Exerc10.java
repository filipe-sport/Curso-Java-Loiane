import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual turno você estuda? Digite M para matutino, V para vespertino ou N para noturno: ");
        String turno = scan.nextLine().toUpperCase();

        switch (turno) {
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido.");
                break;
        }
    }
}
