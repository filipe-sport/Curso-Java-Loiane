import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com sua altura: ");
        float altura = scan.nextFloat();
        System.out.println("Entre com seu sexo (M para masculino, F para feminino): ");
        char sexo = scan.next().toUpperCase().charAt(0);
        System.out.println("Entre com seu peso atual: ");
        float pesoAtual = scan.nextFloat();
        System.out.println(sexo);
        if (sexo == 'M') {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
            if (pesoAtual < pesoIdeal) {
                System.out.println("Você está abaixo do peso ideal.");
            } else if (pesoAtual > pesoIdeal) {
                System.out.println("Você está acima do peso ideal.");
            } else {
                System.out.println("Você está no peso ideal.");
            }
        } else if (sexo == 'F') {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
            if (pesoAtual < pesoIdeal) {
                System.out.println("Você está abaixo do peso ideal.");
            } else if (pesoAtual > pesoIdeal) {
                System.out.println("Você está acima do peso ideal.");
            } else {
                System.out.println("Você está no peso ideal.");
            }
        } 
        
        
       
       

    }
}
