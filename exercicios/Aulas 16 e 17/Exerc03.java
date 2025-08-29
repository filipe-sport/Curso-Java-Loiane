
import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com seu nome: ");
        String name = scan.nextLine();
        System.out.println("Entre com sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Entre com seu salário: ");
        double salary = scan.nextDouble();
        System.out.println("Entre com seu sexo (f ou m): ");
        char sexo = scan.next().charAt(0);
        System.out.println("Entre com seu estado civil (s, c, v, d): ");
        char estadoCivil = scan.next().charAt(0);

        while (name.length() < 3) {
            System.out.println("Nome inválido! O nome deve ter mais de 3 caracteres.");
            System.out.println("Entre com seu nome: ");
            name = scan.nextLine();
        }
        while (idade < 0 || idade > 150) {
            System.out.println("Idade inválida! A idade deve ser entre 0 e 150.");
            System.out.println("Entre com sua idade: ");
            idade = scan.nextInt();
        }
        while (salary <= 0) {
            System.out.println("Salário inválido! O salário deve ser maior que zero.");
            System.out.println("Entre com seu salário: ");
            salary = scan.nextDouble();
        }
        while (sexo != 'f' && sexo != 'm') {
            System.out.println("Sexo inválido! O sexo deve ser 'f' ou 'm'.");
            System.out.println("Entre com seu sexo (f ou m): ");
            sexo = scan.next().charAt(0);
        }
        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.println("Estado civil inválido! O estado civil deve ser 's', 'c', 'v' ou 'd'.");
            System.out.println("Entre com seu estado civil (s, c, v, d): ");
            estadoCivil = scan.next().charAt(0);
        }
        System.out.println("Dados válidos: nome: " + name + ", idade: " + idade + ", salário: " + salary + ", sexo: " + sexo + ", estado civil: " + estadoCivil);
    }
}
