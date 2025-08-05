public class FuncaoScanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número: ");
        float numero = scanner.nextFloat();
        String numero1 = String.valueOf(numero);
        numero1 = numero1.replace('.', '.');
        System.out.println("Você digitou o número: " + numero1);
        scanner.close();
    }
}

//ou
// System.out.print("Digite um número: ");
//         String numero = scanner.next();
//         numero = numero.replace('.', ',');
//         System.out.println("Você digitou o número: " + numero);
//         scanner.close();