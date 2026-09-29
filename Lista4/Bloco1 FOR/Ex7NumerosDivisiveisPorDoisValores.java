import java.util.Scanner;

public class Ex7NumerosDivisiveisPorDoisValores {
    public static void main(String[] args) {
        /*
         * 7. Numeros divisiveis por dois valores
         * Leia um limite positivo e dois divisores positivos. Apresente, dentro do
         * intervalo de 1 ate o limite, os numeros divisiveis pelos dois divisores e
         * conte quantos foram encontrados.
         */

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um valor limite: ");
        int limite = scanner.nextInt();
        System.out.print("Informe o primeiro divisor: ");
        int divisor1 = scanner.nextInt();
        System.out.print("Informe o segundo divisor: ");
        int divisor2 = scanner.nextInt();


        int cont = 0;
        
        for (int i = 1; i <= limite; i++) {
            if (i % divisor1 == 0  && i % divisor2 == 0) {
                System.out.printf("\nO valor %d é divisivel por %d e por %d\n", i, divisor1, divisor2);
                cont++;    
            }
        }

        System.out.printf("Há %d divisores no entre 1 e %d", cont, limite);
    

        scanner.close();
    }
}