import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Entre com a primeira nota do aluno: ");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota do aluno: ");
        double nota2 = scan.nextDouble();
        System.out.println("Entre com a terceira nota do aluno: ");
        double nota3 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        if (media == 10) {
            System.out.println("Aprovado com Distinção! Média: " + media);
        }else if (media >= 7 && media < 10) {
            System.out.println("Aprovado! Média: " + media);
        } else {
            System.out.println("Reprovado! Média: " + media);
        }
    }
}
