
import java.text.DecimalFormat;

public class Exerc38 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        double salario = 1015, reajusteSalario = 0, taxafinal = 0, taxa = 0.015;
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
