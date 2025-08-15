
import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        Float temp_Cel = scan.nextFloat();
        Float temp_Fare = (((9 *temp_Cel)/5)+32);
        System.out.println("A temperatura em Farenheit é: " + temp_Fare);
    }
}
