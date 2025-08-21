import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println(("Quanto você ganha por hora?"));
        double ganho_Hora = scan.nextDouble();
        System.out.println(("Quantas horas de trabalho por mês?"));
        double horas_Mes = scan.nextDouble();
        double salario = ganho_Hora * horas_Mes;
        System.out.println("Seu salário mensal é: " + salario);
    }
}
