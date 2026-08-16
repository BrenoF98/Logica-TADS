import java.util.Scanner;

/**
 * LacoWl
 */
public class LacoWl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Laço While contador de 1 a 10.
    
        int contador = 1;

/*         while (contador <= 10){
            System.out.println("Contador: " + contador);
            contador++;
        } */
       do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 10);

        int opcao;

        do {
            System.out.println("1-Cadastrar  2-Listar  3-Sair");
            opcao = scanner.nextInt();
            System.out.println("Opção escolhida: " + opcao);

        } while (opcao != 3);

        scanner.close();
    }

}
