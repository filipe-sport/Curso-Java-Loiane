
import java.util.Scanner;

public class Exerc28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o tipo da carne? (File Duplo, Alcatra, Picanha)");
        String tipoCarne = scan.nextLine();
        System.out.println("Qual a quantidade de carne (em Kg)?");
        double qtdCarne = scan.nextDouble();
        System.out.println("A compra será feita com o cartão Tabajara? (S/N)");
        char cartaoTabajara = scan.next().toLowerCase().charAt(0);
        double precoKg = 0;
        // Determina o preço por Kg com base no tipo e quantidade de carne
        switch (tipoCarne.toLowerCase()) {
            case "file duplo":
                if (qtdCarne <= 5) {
                    precoKg = 4.90;
                } else {
                    precoKg = 5.80;
                }
                break;
            case "alcatra":
                if (qtdCarne <= 5) {
                    precoKg = 5.90;
                } else {
                    precoKg = 6.80;
                }
                break;
            case "picanha":
                if (qtdCarne <= 5) {
                    precoKg = 6.90;
                } else {
                    precoKg = 7.80;
                }
                break;
            default:
                System.out.println("Tipo de carne inválido.");
                return;
        }
        // Calcula o preço total, desconto e preço final
        double precoTotal = precoKg * qtdCarne;
        double desconto = 0;
        if (cartaoTabajara == 's') {
            desconto = precoTotal * 0.05;
        }
        // Exibe o cupom fiscal
        double precoFinal = precoTotal - desconto;
        System.out.printf("Tipo de carne: %s%n", tipoCarne);
        System.out.printf("Quantidade de carne: %.2f Kg%n", qtdCarne);
        System.out.printf("Preço total: R$ %.2f%n", precoTotal);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Preço a pagar: R$ %.2f%n", precoFinal); 
    }
}
