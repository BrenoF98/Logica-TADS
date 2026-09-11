import java.util.Scanner;

public class CForSomaDeXaY {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe dois numeros (Sendo o primeiro menor que o segundo)");
        int numeroX = entrada.nextInt();
        int numeroY = entrada.nextInt();

        int soma = 0;

        if (numeroX < numeroY) {
            System.out.println("\nFOR: \n \nNúmeros entre X e Y, inclusive: \n");
            for (int i = numeroX; i <= numeroY; i++) {
                
                System.out.println("-> " + i);
                soma = soma + i;
                
            }
            System.out.printf("\nSomatorio de %d até %d = %d\n", numeroX, numeroY, soma);
            
            soma = 0;
            int i = numeroX;
            
            System.out.println("\nWHILE: \n \nNúmeros entre X e Y, inclusive: \n");

            while (i <= numeroY) {

                System.out.println("-> " + i);
                soma = soma + i;

                i++;

            }
            System.out.printf("\nSomatorio de %d até %d = %d\n", numeroX, numeroY, soma);

        } else {
            System.out.println("Erro!");
        }

        entrada.close();
    }
}
