import java.util.Scanner;

public class Exerc19 {
public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    double  media;
    double[] nota1 = new double[10];
    double[] nota2 = new double[10];
    double[] result = new double[10] ;

    for(int i = 0; i < nota1.length; i++){
        System.out.println("Entre com o valor da "+(i+1)+"ª nota na posição"+i+"");
        nota1[i] = scan.nextDouble();

    }
    for(int j = 0; j < nota2.length; j++){
        System.out.println("Entre com o valor da "+(j+1)+"ª nota na posição "+j+"");
        nota2[j] = scan.nextDouble();
    }
    for(int z = 0; z < nota1.length; z++){
        media = (nota1[z]+nota2[z])/2;
        result[z] = media;
    }
    for(int k = 0; k < nota1.length; k++){
       if(result[k] >= 7){
        System.out.println("O aluno "+(k+1)+" foi aprovado com a média: "+result[k]);
       }else{
        System.out.println("O aluno "+(k+1)+" foi reprovado com a média: "+result[k]);
       }
    }
    
}
}
