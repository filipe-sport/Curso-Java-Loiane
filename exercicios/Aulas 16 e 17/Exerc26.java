import java.util.Scanner;

public class Exerc26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int i = 0;
        int cont1 = 0, cont2 = 0, cont3 = 0;
        System.out.println("Entre com o total de eleitores da Seção: ");
        int total = scan.nextInt();
        while(i < total){            
            System.out.println("Entre com o candidato de sua preferência: ");
            String candidato = scan.next().toLowerCase(); 
                
                if ("candidato1".equals(candidato)){
                    cont1++;
                } else if ("candidato2".equals(candidato)){
                    cont2++;
                }else if ("candidato3".equals(candidato)){
                    cont3++;
                }
                
        i++;
        }
        System.out.println("O total do Candidato1 foi de "+ cont1 +", o total do Candidato2 foi de "+ cont2 +", o total do Candidato3 foi de "+ cont3);      
    }
        
}

