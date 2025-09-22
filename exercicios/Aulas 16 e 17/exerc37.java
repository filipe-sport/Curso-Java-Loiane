import java.text.DecimalFormat;
import java.util.Scanner;

public class exerc37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.##");        
        double maisAlto = 0, maisGordo = 0, maisMagro = 0, maisBaixo = 0, mediaAltura = 0, mediaPeso = 0,
        somaAltura = 0, somaPeso = 0;
        int opcao = 1, cont = 1;
        String output1 = "", output2 = "", output3 = "", output4 = "";

        do { 
            System.out.println("Entre com sua matrícula: ");
            int matricula = scan.nextInt();
            System.out.println("Entre com sua altura: ");
            double altura = scan.nextDouble();
            System.out.println("Entre com seu peso: ");
            double peso = scan.nextDouble();
            somaAltura += altura;
            somaPeso += peso;
            mediaAltura = somaAltura/cont;            
            mediaPeso = somaPeso/cont; 

        
        
            
            //verificação do primeiro / referência
            if(cont == 1){                
                maisAlto = altura;
                maisBaixo = altura;
                maisGordo = peso;
                maisMagro = peso;
            } 

            // condição para os próximos caso haja          
            if(peso >= maisGordo){
                maisGordo = peso;
                output1 = "O mais gordo é: " + matricula + " com o peso: " + maisGordo;
            }
            if (peso <= maisMagro){
                maisMagro = peso;
                output2 = "O mais magro é: " + matricula + " com o peso: " + maisMagro;
            }
            if (altura >= maisAlto){
                maisAlto = altura;
                output3 = "O mais alto é: " + matricula + " com altura de: " + maisAlto;
            }
            if (altura <= maisBaixo){
                maisBaixo = altura;
                output4 = "O mais baixo é: " + matricula + " com altura de: " + maisBaixo;
            }    
            System.out.println("Para prosseguir digite 1 ou 0 para encerrar!!");
            opcao = scan.nextInt();            
            
            cont++;
        } while (opcao != 0);
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println("A média das alturas é de: "+ df.format(mediaAltura));
        System.out.println("A média dos pesos é de: "+df.format(mediaPeso));
        
    }

}
