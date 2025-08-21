import java.util.Scanner;

public class Exerc14{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com a primeira nota do aluno: ");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota do aluno: ");
        double nota2 = scan.nextDouble();        
        double media = (nota1 + nota2) / 2;
        
        System.out.println("Media de aproveitamento\t\tConceito");
        System.out.println("Entre 9.0 e 10.0\t\t A");
        System.out.println("Entre 7.5 e 8.9\t\t\t B");
        System.out.println("Entre 6.0 e 7.4\t\t\t C");
        System.out.println("Entre 4.0 e 5.9\t\t\t D");
        System.out.println("Entre 4.0 e 0.0\t\t\t E");

        System.out.println("A primeira do aluno foi: " + nota1);
        System.out.println("A segunda do aluno foi: " + nota2);
        System.out.println("A média do aluno é: " + String.format("%.2f", media)); 

        if (media >= 9.0 && media <= 10.0) {
            System.out.println("O conceito do aluno foi: A ");
            System.out.println("Parabéns, você foi APROVADO!! ");
        } else if (media >= 7.5 && media <= 8.9) {
            System.out.println("O conceito do aluno foi: B");
            System.out.println("Parabéns, você foi APROVADO!! ");
        } else if (media >= 6.0 && media <= 7.4) {
            System.out.println("O conceito do aluno foi: C");
            System.out.println("Parabéns, você foi APROVADO!! ");
        } else if (media >= 4.0 && media <= 5.9) {
            System.out.println("O conceito do aluno foi: D");
            System.out.println("Infelizmente, você foi REPROVADO!! ");
        } else if (media >= 0.0 && media <= 3.9) {
            System.out.println("O conceito do aluno foi: E");  
            System.out.println("Infelizmente, você foi REPROVADO!! ");
        } else {
            System.out.println("Alguma nota está inválida!");
        }

        

    }
}