import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println(("Quanto você ganha por hora?"));
        Float ganho_Hora = scan.nextFloat();
        System.out.println(("Quantas horas de trabalho por mês?"));
        Float horas_Mes = scan.nextFloat();
        Float salario = ganho_Hora * horas_Mes;
        System.out.println("Seu salário mensal é: " + salario);
    }
}
