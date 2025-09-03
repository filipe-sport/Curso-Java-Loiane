
import java.util.Scanner;

public class Exerc24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int cont = 0;
        double nota = 0;
        char resposta = 'S';
          
        
        while (resposta == 'S'){
            System.out.println("Entre com uma nota: ");
            nota += scan.nextDouble();
            System.out.println("Gostaria de continuar a entrar com mais notas? (S/N)");
            resposta = scan.next().toUpperCase().charAt(0);            
            cont++;
        } 
        System.out.println(nota);
        System.out.println(cont);
        System.out.println("A média das notas digitadas foram: " + nota/cont);   
    }   
}