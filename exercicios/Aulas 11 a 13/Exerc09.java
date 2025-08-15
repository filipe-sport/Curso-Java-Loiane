import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        System.out.println("Qual a temperatura em Farenheit? ");
        Scanner scan = new Scanner (System.in);
        Float temp_Fare = scan.nextFloat();
        Float temp_Cel = ((5 * (temp_Fare - 32))/9);
        System.out.println("A temperatura em Celsius é: " + temp_Cel);
    }
}
