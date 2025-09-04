
import java.util.Scanner;

public class Exerc25 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        char resposta = 'S';
        int idade = 0;
        int cont = 0;
        
        

        while (resposta == 'S'){
            System.out.println("Digite a sua idade: ");
            idade += scan.nextInt(); 
            System.out.println("Gostaria de digitar outra idade? ");
            resposta = scan.next().toUpperCase().charAt(0);
            cont++;
        }
        double media = idade / cont;
        if(media>0 && media<=25){
            System.out.println("População Jovem!");
        } else if (media>25 && media < 60){
            System.out.println("População Adulta!");
            
        } else if (media > 60){
            System.out.println("População Idosa!");
        }
                    
    }
}
