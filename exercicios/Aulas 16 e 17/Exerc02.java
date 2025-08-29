import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com seu nome de usuário: ");
        String user = scan.nextLine();
        System.out.println("Entre com sua senha: ");
        String password = scan.nextLine();
        while (user.toLowerCase().equals(password.toLowerCase())) {
            System.out.println("Senha inválida! A senha não pode ser igual ao nome de usuário.");
            System.out.println("Entre com sua senha: ");
            password = scan.nextLine();
        }
    }
}
