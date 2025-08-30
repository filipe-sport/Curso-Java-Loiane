import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        int i = 0;
        int soma = 0;
        int media = 0;        
        while(i < 5){
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            int num = scan.nextInt();
            soma = soma + num;
            i++;
        }
        System.out.println("A soma dos numeros digitados foi: " + soma);
        media = soma / 5;
        System.out.println("A media dos numeros digitados foi: " + media);
    }
}
