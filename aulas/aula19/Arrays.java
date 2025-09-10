public class Arrays {
public static void main(String[] args) {
    double [] temperaturas = new double[365];
    temperaturas[0] = 31.3;
    temperaturas[1] = 31.3;
    temperaturas[2] = 31.3;
    temperaturas[3] = 31.3;
    temperaturas[4] = 31.3;
    
    System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
    System.out.println("O tamanho do array: "+temperaturas.length);
    System.out.println("Valores do array: ");

    for (int i = 0; i < temperaturas.length; i++) {
        System.out.println("O valor da temperatura do dia "+(i+1) + " é: "+ temperaturas[i]);
    }
}
}
