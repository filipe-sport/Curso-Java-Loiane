
public class Exerc04 {
    public static void main(String[] args) {
        double populacaoA = 80000;
        double populacaoB = 200000;
        double crescimentoA = 0.03;
        double crescimentoB = 0.015;
        int anos = 0;

        while (populacaoB >= populacaoA) {
            populacaoA += populacaoA * crescimentoA;
            populacaoB += populacaoB * crescimentoB;
            anos++;
        }
        System.out.println("A população A ultrapassará a população B em " + anos + " anos.");
    }
}
