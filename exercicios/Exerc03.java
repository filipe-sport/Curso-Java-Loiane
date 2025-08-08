import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
    Scanner numero1 = new Scanner (System.in);
    Scanner numero2 = new Scanner (System.in);
    
    System.out.print("Digite o primeiro número: ");
    int num1 = numero1.nextInt();
    
    System.out.print("Digite o segundo número: ");
    int num2 = numero2.nextInt();
    
    int soma = num1 + num2;
    
    System.out.println("A soma dos números digitados é: " + soma);   
    }
}
