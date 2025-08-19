
import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  
    System.out.println("Entre com a quantidade de horas trabalhadas: ");
    int horasTrabalhadas = scan.nextInt();
    System.out.println("Entre com o valor da hora trabalhada: ");
    double valorHora = scan.nextDouble();
    double salarioBruto = horasTrabalhadas * valorHora;
    double descontoIR;

    if (salarioBruto <= 900) {
        descontoIR = salarioBruto * 0.00;
    } else if (salarioBruto > 900 && salarioBruto <= 1500) {
        descontoIR = salarioBruto * 0.05;
    } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
        descontoIR = salarioBruto * 0.10;
    } else {
        descontoIR = salarioBruto * 0.20;
    }


    System.out.println("Salário bruto ("+valorHora+" * "+horasTrabalhadas+"): R$ " + salarioBruto);
    System.out.println("(-) IR ("+(String.format("%.0f",descontoIR * 100/salarioBruto))+"%): R$ " + String.format("%.2f", descontoIR));
    System.out.println("(-) INSS (10%): R$ " + String.format("%.2f", salarioBruto * 0.10));
    System.out.println("FGTS (11%): R$ " + String.format("%.2f", salarioBruto * 0.11));
    System.out.println("Total de descontos: R$ " + String.format("%.2f", descontoIR + (salarioBruto * 0.10)));
    System.out.println("Salário líquido: R$ " + String.format("%.2f", salarioBruto - (descontoIR + (salarioBruto * 0.10))));
}
}
   
