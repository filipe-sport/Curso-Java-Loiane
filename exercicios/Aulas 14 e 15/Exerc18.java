
import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma data (dd/mm/aaaa): ");
        String data = scan.nextLine();
        String[] partes = data.split("/");
        // Verifica se a data tem 3 partes
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);
        boolean dataValida = true;
        // Verifica mês e dia
        if (mes < 1 || mes > 12) {
            dataValida = false;
        } else if (dia < 1) {
            dataValida = false;
        } else {
            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if (dia > 31) dataValida = false;
                    break;
                case 4: case 6: case 9: case 11:
                    if (dia > 30) dataValida = false;
                    break;
                case 2:
                // Caso seja um ano bissexto (exclusivo para fevereiro mês 2)
                    boolean anoBissexto = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
                    if (anoBissexto) {
                        if (dia > 29) dataValida = false;
                    } else {
                        if (dia > 28) dataValida = false;
                    }
                    break;
            }           
        }
        if (dataValida) {
            System.out.println("A data " + data + " é válida.");
        } else {
            System.out.println("A data " + data + " é inválida.");
        }       
    }
}
