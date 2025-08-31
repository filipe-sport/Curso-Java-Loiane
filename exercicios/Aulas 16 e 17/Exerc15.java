public class Exerc15 {
    public static void main(String[] args) {
        //Série de Fibonacci
        int n1 = 0, n2 = 1, n3, contador, num = 0;
        System.out.print(n1 + " " + n2);
        for (contador = 2; contador>num; contador++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
