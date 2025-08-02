package aula10;

public class Variaveis {
    public static void main(String[] args) {
        int idade = 41;
        String nome = "Filipe";
        String nomeDoMeuCachorro = "totó";
        String ano2014 = "2014";

        //Aceito, mas não utilizado
        int _idade;
        int $idade;

        //Não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

       idade = 42; //Reatribuição de valor

        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
        System.out.println("Meu cachorro se chama " + nomeDoMeuCachorro + ".");
        System.out.println("Ano: " + ano2014);
    }
}
