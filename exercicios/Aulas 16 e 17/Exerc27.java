
import java.util.Scanner;

public class Exerc27 {
   public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println(" Entre com a quantidade de turmas: ");
    int turmas = scan.nextInt();
    System.out.println("Entre com a quantidade de alunos por turma: ");
    int alunosPorTurna = scan.nextInt();
    double media = alunosPorTurna/turmas;
    double resultado = Math.round(media);
    if (resultado > 40){
        System.out.println("As turmas estão com excedente de alunos.");
    }else{

        System.out.println("As turmas possuem em média "+resultado+" alunos");
    }
   } 
}
