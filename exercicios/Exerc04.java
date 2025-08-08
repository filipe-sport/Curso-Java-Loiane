import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float nota1 = nota.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float nota2 = nota.nextFloat();
        
        System.out.print("Digite a terceira nota: ");
        float nota3 = nota.nextFloat();
        System.out.println("Digite a quarta nota: ");
        float nota4 = nota.nextFloat();
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("A média das notas digitadas é: " + String.valueOf(media).replace('.', ','));

        // Scanner nota = new Scanner(System.in);
        // System.out.print("Digite a primeira nota: ");
        // double nota1 = nota.nextDouble();
        
        // System.out.print("Digite a segunda nota: ");
        // double nota2 = nota.nextDouble();
        
        // System.out.print("Digite a terceira nota: ");
        // double nota3 = nota.nextDouble();
        // System.out.println("Digite a quarta nota: ");
        // double nota4 = nota.nextDouble();
        
        // double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        // System.out.println("A média das notas digitadas é: " + String.valueOf(media).replace('.', ','));
        
    }
}