import java.util.Scanner;

public class Ex2ConversaoDeSegundo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // entrada

        int quantSegundos, hora, minuto, segundo;

        // leitura

        System.out.println("Informe o tempo em segundos: ");
        quantSegundos = entrada.nextInt();
        if (quantSegundos > 0) {

            hora = quantSegundos / 3600;
            minuto = (quantSegundos % 3600) / 60;
            segundo = quantSegundos % 60;

            System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
        } else {
            System.out.println("ERRO!! Valor invalido.");
        }

        entrada.close();
    }

}
