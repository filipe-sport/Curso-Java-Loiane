
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc38 {
    public static void main(String[] args) {
        double reajusteSalario = 0, taxafinal = 0, taxa = 0.015;
        Scanner scan = new Scanner (System.in);
        System.out.println("Entre com o valor do salário: ");
        double salario = scan.nextDouble();
        DecimalFormat df = new DecimalFormat("#.##");
        int anoInicial = 1997, anoFinal = 2025;
            while (anoInicial < anoFinal){
                taxafinal += 2 * taxa;
                anoInicial++;
            }
            reajusteSalario = (salario*taxafinal);
            double salarioReajustado = reajusteSalario + salario;
        
        System.out.println(df.format(salarioReajustado));

    }
}
