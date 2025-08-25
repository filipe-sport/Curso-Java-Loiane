import java.util.Scanner;

public class Exerc26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a quantidade de combustivel em litros:");
        double litros = scan.nextDouble();
        System.out.println("Entre com o tipo de combustivel (A-álcool, G-gasolina):");
        char tipo = scan.next().toUpperCase().charAt(0);
        double precoLitro = 0;
        double desconto = 0;
        if (tipo == 'A') {
            precoLitro = 1.90;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipo == 'G') {
            precoLitro = 2.50;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            return;
        }
    
        double precoTotal = litros * precoLitro;
        double valorDesconto = precoTotal * desconto;
        double valorFinal = precoTotal - valorDesconto;
        System.out.println("Valor a ser pago: R$ "+ valorFinal);

    }
}

