import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int proxima = 1, i = 1;
        double valor = 0, total = 0, dinheiro = 0, troco = 0;
        String output = "";
        DecimalFormat df = new DecimalFormat("#.##");

        while (proxima != 0) { 
            
            System.out.println("Entre com o valor do produto: ");
            valor = scan.nextDouble();
            total += valor;
            System.out.println("Existe mais mais algum produto? (0 - Não / 1 - Sim)");
            proxima = scan.nextInt();
            output += "produto " + i + ": R$ " + valor + "\n";  
            i++;
        }
        System.out.println("Subtotal dos produtos: "+ df.format(total));
        System.out.println("Quanto em dinheiro recebido: ");
        dinheiro = scan.nextDouble();
        troco = dinheiro - total;

        //Nota fiscal
        System.out.println(" Lojas Tabajara");
        System.out.println("");
        System.out.println(output);
        System.out.println("Total: " + total);
        System.out.println("Dinheiro: "+ dinheiro);
        System.out.println("Troco: "+ df.format(troco));
        
                       
    }
}
