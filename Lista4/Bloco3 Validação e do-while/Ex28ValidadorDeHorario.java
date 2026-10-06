import java.util.Scanner;

public class Ex28ValidadorDeHorario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora, minuto, segundo;
        boolean correto = true;

        do {

            System.out.print("\nInforme Hora, minuto e segundo (HH:MM:SS) -> ");
            hora = scanner.nextInt();
            minuto = scanner.nextInt();
            segundo = scanner.nextInt();

            

            if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
                correto = false;
                System.out.println("Hora invalida\nTente novamente.");
            }else {
                correto = true;
                System.out.println("A hora aceita é: ");
                System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
            }

        } while (!correto);

        scanner.close();
    }
}
