import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do círculo:");        
        Float raio = scan.nextFloat();
        Double area = 3.14 * (raio * raio);
        System.out.println("A área do círculo é: " + area);
    }
}
