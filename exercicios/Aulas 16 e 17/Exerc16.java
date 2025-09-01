public class Exerc16 {
    public static void main(String[] args) {
        
        int n1 = 0, n2 = 1, n3,contador =0;
        //Série de Fibonacci ate o n-esimo termo
        System.out.print(n1 + " " + n2);
        do{
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            contador++;
        }while(n3 <= 500);
        }       
}

