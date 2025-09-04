import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc29{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Entre com a quantidade de itens: ");
        double quantItens = scan.nextDouble();
        System.out.println("Lojas Quase Dois - Tabela de Preços");
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 1; i <= quantItens; i++ ){
            System.out.println( i + " - " + df.format(i * 1.99));
        }
    }
}
