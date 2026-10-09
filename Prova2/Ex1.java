import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * 1. Monitoramento de temperatura
         * Um equipamento registra temperaturas durante seu funcionamento.
         * Leia valores reais de temperatura até que seja digitado -999, que representa
         * o fim das
         * medições e não deve ser ontabilizado.
         * 
         * Ao final, informe:
         * 
         * quantidade de medições; *
         * temperatura média;*
         * maior temperatura;*
         * menor temperatura;*
         * quantidade de medições acima de 35 °C; *
         * quantidade de medições abaixo de 5 °C.*
         * 
         * Considere que pelo menos uma temperatura será informada antes do sentinela.
         */
        float temp, somaTemp = 0, media = 0;
        float maior = -998, menor = Float.MAX_VALUE;
        int contMaior35 = 0, contMenor5 = 0, contDeMedidas = 0;

        do {

            System.out.print("Informe a temperatura: ");
            temp = sc.nextFloat();

            if (temp == -999)
                break;
            contDeMedidas++; // conta quantos foram validos.
            somaTemp += temp; // soma todos os valore validos.

            if (maior < temp) { // encontra o maior iformado durante o laço.
                maior = temp;
            }

            if (menor > temp) { // encontra o menor informado durante o laço.
                menor = temp;
            }

            if (temp > 35) { // conta quantas maior que 35.
                contMaior35++;
            }

            if (temp < 5) { // conta quantoas menor que 5.
                contMenor5++;
            }

        } while (temp != -999);

        media = somaTemp / contDeMedidas;

        System.out.printf("""

                              Relatorio Final:

                Quantidade de medições..................-> %d
                Temperatura média.......................-> %.2f °C
                Maior temperatura.......................-> %.2f °C
                Menor temperatura.......................-> %.2f °C
                Quantidade de medições acima de 35 °C...-> %d
                Quantidade de medições abaixo de 5 °C...-> %d\n
                       """, contDeMedidas, media, maior, menor, contMaior35, contMenor5);

        sc.close();
    }
}
