
import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salário ataual: ");  
        double salario = scan.nextDouble();
        double novoSalario = 0;
        if (salario <= 280) {
            System.out.println("Salário abaixo de R$ 280,00: aumento de 20%.");
            novoSalario = salario *= 1.20;
        }
        if (salario >280 && salario <= 700) {
            System.out.println("Salário entre R$ 280,00 e R$ 700,00: aumento de 15%.");
            novoSalario = salario *= 1.15;
        }
        if (salario > 700 && salario <= 1500) {
            System.out.println("Salário entre R$ 700,00 e R$ 1500,00: aumento de 10%.");
            novoSalario = salario *= 1.10;
        }
        if (salario > 1500) {
            System.out.println("Salário acima de R$ 1500,00: aumento de 5%.");
            novoSalario = salario *= 1.05;
        }
        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("O percentual aplicado foi de: " + (novoSalario / salario - 1) * 100 + "%");
        System.out.println("Valor do aumento: R$ " + (novoSalario - salario));
        System.out.printf("Seu novo salário é: R$ %.2f%n", salario);
    }
}
