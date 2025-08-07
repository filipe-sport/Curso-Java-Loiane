import java.util.Scanner;

public class FuncaoScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float numero = scan.nextFloat();
        String numero1 = String.valueOf(numero);
        numero1 = numero1.replace('.', ',');
        System.out.println("Você digitou o número: " + numero1);        
    }
}

//ou
// System.out.print("Digite um número: ");
//         String numero = scanner.next();
//         numero = numero.replace('.', ',');
//         System.out.println("Você digitou o número: " + numero);
//         scanner.close();