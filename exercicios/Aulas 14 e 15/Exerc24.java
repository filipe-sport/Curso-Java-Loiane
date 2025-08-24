
import java.util.Scanner;

public class Exerc24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Entre com o segundo número:");
        double num2 = scanner.nextDouble();
        System.out.println("Entre com a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);
        double resultado = 0;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':                
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
        if (resultado % 2 == 0) {
                    System.out.println("O resultado é par.");
                } else {
                    System.out.println("O resultado é ímpar.");
                }
        if (resultado > 0) {
                    System.out.println("O resultado é positivo.");
                } else if (resultado < 0) {
                    System.out.println("O resultado é negativo.");
                } else {
                    System.out.println("O resultado é zero.");
                }
        if (resultado % 1 == 0) {
                    System.out.println("O resultado é um número inteiro.");
                } else {
                    System.out.println("O resultado é um número decimal.");
                }
    }
}
