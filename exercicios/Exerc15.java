import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora trabalhada?");
        float ganhoPorHora = scan.nextFloat();
        System.out.println("Quantas horas completas você trabalhou no mês?");
        int horasTrabalhadas = scan.nextInt();
        // Cálculo do salário bruto
        float salarioBruto = ganhoPorHora * horasTrabalhadas;
        System.out.printf("Seu salário bruto é: R$ %.2f%n", salarioBruto);
        // Cálculo do desconto do IR
        float iRenda = 0.11f * salarioBruto;
        System.out.printf("Desconto do IR (11%%): R$ %.2f%n", iRenda);
        // Cálculo do desconto do INSS
        float inss = 0.08f * salarioBruto;
        System.out.printf("Desconto do INSS (8%%): R$ %.2f%n", inss);
        //Cálculo para o desconto do sindicato
        float sindicato = 0.05f * salarioBruto;
        System.out.printf("Desconto do sindicato (5%%): R$ %.2f%n", sindicato);
        // Cálculo do salário líquido
        float salarioLiquido = salarioBruto - (iRenda + inss + sindicato);
        System.out.printf("Seu salário líquido é: R$ %.2f%n", salarioLiquido);
        
        
    }
}
