
import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salário ataual: ");  
        double salario = scan.nextDouble();
        double novoSalario = 0;
        if (salario <= 280) {
            System.out.println("Salário antes do reajuste: R$ " + salario);
            novoSalario = salario * 1.20;
        }
        if (salario >280 && salario <= 700) {
            System.out.println("Salário antes do reajuste: R$ " + salario);
            novoSalario = salario * 1.15;
        }
        if (salario > 700 && salario <= 1500) {
            System.out.println("Salário antes do reajuste: R$ " + salario);
            novoSalario = salario * 1.10;
        }
        if (salario > 1500) {
            System.out.println("Salário antes do reajuste: R$ " + salario);
            novoSalario = salario * 1.05;
        }        
       
        double percentual = ((novoSalario / salario) - 1) * 100;
        String formatPercentual = String.format("%.2f", percentual);
        System.out.println("O reajuste aplicado foi de: " + formatPercentual + "%");
        System.out.println("Valor do aumento: R$ " + (novoSalario - salario));
        System.out.printf("Seu novo salário é: R$ %.2f%n", novoSalario);
    }
}
