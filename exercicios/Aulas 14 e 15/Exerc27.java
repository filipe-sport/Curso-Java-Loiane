import java.util.Scanner;

public class Exerc27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de morango desejado:");
        double qtdMorango = scan.nextDouble();
        System.out.println("Digite a quantidade de maçã desejado:");
        double qtdMaca = scan.nextDouble();
        double precoMorango;
        double precoMaca;
        if (qtdMorango <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }
        if (qtdMaca <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }
        double totalMorango = qtdMorango * precoMorango;
        double totalMaca = qtdMaca * precoMaca;
        double totalCompra = totalMorango + totalMaca;
        if (totalCompra > 25 || (qtdMorango + qtdMaca) > 8) {
            totalCompra *= 0.90; // Aplica desconto de 10%
        }
        System.out.printf("O total da compra é: R$ %.2f%n", totalCompra);
    }    
        
       
}
