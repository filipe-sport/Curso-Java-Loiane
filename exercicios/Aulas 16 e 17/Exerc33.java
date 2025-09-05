import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int  qtdTemp = 0;
        double maior, menor, temp = 0;
        System.out.println("Entre com a quantidade de temperaturas: ");
        qtdTemp = scan.nextInt();
        System.out.println("Entre com a temperatura: ");
        double tempInicial = scan.nextDouble();
        maior = tempInicial;
        menor = tempInicial;
        for (int i = 0; i < qtdTemp-1; i++){
            System.out.println("Entre com a temperatura: ");
            temp = scan.nextDouble();

            if(temp>maior){
                maior = temp;
            }
            else if (temp < menor){
                menor = temp;
            }
        }
        
        
        System.out.println("A maior temperatura foi: "+maior+" e a menor temperatura foi: "+menor);
    }
}
