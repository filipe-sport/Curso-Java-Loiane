import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Para masculino digite M, para feminino digite F: ");
        String sexo = scan.nextLine().toUpperCase();
        // if (sexo.equals("M")) {
        //     System.out.println("O sexo informado eh masculino.");
        // } else if (sexo.equals("F")) {
        //     System.out.println("O sexo informado eh feminino.");
        // } else {
        //     System.out.println("Sexo invalido.");
        // } 

        // Simplified version using equals method

        // if ("M".equals(sexo)) {
        //     System.out.println("O sexo informado eh masculino.");
        // } else if ("F".equals(sexo)) {
        //     System.out.println("O sexo informado eh feminino.");
        // } else {
        //     System.out.println("Sexo invalido.");
        // }

        // Simplified version using switch statement
        
        switch (sexo) {
            case "M":
                System.out.println("O sexo informado eh masculino.");
                break;
            case "F":
                System.out.println("O sexo informado eh feminino.");
                break;
            default:
                System.out.println("Sexo invalido.");
                break;
        }
    }
}
