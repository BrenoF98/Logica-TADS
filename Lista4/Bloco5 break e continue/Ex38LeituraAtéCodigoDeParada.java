import java.util.Scanner;

public class Ex38LeituraAtéCodigoDeParada {

    public static void main(String[] args) {
        /*
         * 38. Leitura ate codigo de parada
         * Leia codigos inteiros. Codigos negativos devem ser ignorados com continue; o
         * codigo 0 encerra com break; os positivos devem ser classificados como pares
         * ou impares. Ao final, mostre os totais.
         */
        Scanner scanner = new Scanner(System.in);
        int codigo;
        int somaPar = 0, somaImpar = 0;

        do {
            System.out.print("Informe o codigo: ");
            codigo = scanner.nextInt();

            if (codigo == 0) { // para
                System.out.println("Finalizando...");
                break;
            }

            if (codigo < 0) // pula o bloco logico e reinicia o laço.
                continue;

            if (codigo % 2 == 0) { // verofoca se é par
                System.out.printf("%d é par!\n", codigo);
                somaPar += codigo;
            } else { // se não for é impar
                System.out.printf("%d é impar!\n", codigo);
                somaImpar += codigo;
            }

        } while (codigo != 0);

        System.out.printf("Soma dos pares: %d\nSoma dos impares: %d", somaPar, somaImpar);

        scanner.close();
    }
}