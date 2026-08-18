import java.util.Scanner;
public class PodeDirigir {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        boolean temHabilitacao = true;

        // É possivel ter milhares de ifs aninhados, mas isso não é uma boa prática de programação, 
        // pois dificulta a leitura do código e aumenta a complexidade do mesmo.

        if (idade >= 18) { // veja que essa primeira condição exclui todas pessoas que podem ter carteira. 
            //isso eveita processamento desnecessário, 
            // pois não faz sentido perguntar se a pessoa tem habilitação se ela não tem idade para dirigir.
            System.out.println("verificar se tem habilitação!");
            System.out.println("Tem habilitação? " + temHabilitacao);
            temHabilitacao = entrada.nextBoolean();
            if (temHabilitacao) {
                System.out.println("Maior e habilitado, pode dirigir!");
            } else {
                System.out.println("Maior mas não habilitado, não pode dirigir!");
            }
        } else {
            System.out.println("Não tem idade para dirigir!");
        }

        entrada.close();

    }
}
