import java.util.Scanner;

public class BForContRegNa10 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numeroNInformado = entrada.nextInt();

        System.out.println("\nFOR: \n");
        for (int numeroN = numeroNInformado;numeroN >= 0; numeroN--){

            System.out.println("Contagem: " + numeroN);
        }

        entrada.close();
    }    
}
