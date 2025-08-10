import java.util.Scanner;

public class Exerc12 {
public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Entre com a sua altura: ");
    float altura = scan.nextFloat();
    Double peso_Ideal = ((72.7 * altura) - 58);
    System.out.printf("Seu peso ideal é: %.2f kg", peso_Ideal);
    scan.close();  
}
}