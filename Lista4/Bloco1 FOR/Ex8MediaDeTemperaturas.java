import java.util.Scanner;

public class Ex8MediaDeTemperaturas {
    /*
     * 8. Media de temperaturas
     * Leia exatamente 12 temperaturas reais, uma para cada mes. Calcule a media e
     * informe quantas temperaturas ficaram acima da media. Nao use vetor.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float temperatura;
        float soma = 0;
        float media = 0;
        float temperatura1 = 0, temperatura2 = 0, temperatura3 = 0, temperatura4 = 0, temperatura5 = 0,
                temperatura6 = 0, temperatura7 = 0, temperatura8 = 0, temperatura9 = 0, temperatura10 = 0,
                temperatura11 = 0, temperatura12 = 0;

        int acimaDaMedia = 0;
        for (int i = 1; i <= 12; i++) {

            System.out.printf("\nInforme a temperatura média do mês %d no seu estado: ", i);
            temperatura = scanner.nextFloat();

            soma += temperatura;

            if (i == 1) {
                temperatura1 = temperatura;
            }
            if (i == 2) {
                temperatura2 = temperatura;
            }
            if (i == 3) {
                temperatura3 = temperatura;
            }
            if (i == 4) {
                temperatura4 = temperatura;
            }
            if (i == 5) {
                temperatura5 = temperatura;
            }
            if (i == 6) {
                temperatura6 = temperatura;
            }
            if (i == 7) {
                temperatura7 = temperatura;
            }
            if (i == 8) {
                temperatura8 = temperatura;
            }
            if (i == 9) {
                temperatura9 = temperatura;
            }
            if (i == 10) {
                temperatura10 = temperatura;
            }
            if (i == 11) {
                temperatura11 = temperatura;
            }
            if (i == 12) {
                temperatura12 = temperatura;
            }

        }

        media = soma / 12.0f;

        if (temperatura1 > media) {
            acimaDaMedia++;
        }
        if (temperatura2 > media) {
            acimaDaMedia++;
        }
        if (temperatura3 > media) {
            acimaDaMedia++;
        }
        if (temperatura4 > media) {
            acimaDaMedia++;
        }
        if (temperatura5 > media) {
            acimaDaMedia++;
        }
        if (temperatura6 > media) {
            acimaDaMedia++;
        }
        if (temperatura7 > media) {
            acimaDaMedia++;
        }
        if (temperatura8 > media) {
            acimaDaMedia++;
        }
        if (temperatura9 > media) {
            acimaDaMedia++;
        }
        if (temperatura10 > media) {
            acimaDaMedia++;
        }
        if (temperatura11 > media) {
            acimaDaMedia++;
        }
        if (temperatura12 > media) {
            acimaDaMedia++;
        }

        System.out.printf("MÉDIA: %0.2f%n", media);
        System.out.printf("%d meses foram acima da média.\n", acimaDaMedia);

        scanner.close();
    }
}
/*
 * Informações retiradas do site:
 * https://pt.weatherspark.com/y/29606/Clima-caracter%C3%ADstico-em-Rio-Grande-Rio-Grande-do-Sul-Brasil-durante-o-ano#Figures-ColorTemperature
 * 
 * 24 24 23 20 17 14 15 16 18 21 23 14
 * MÉDIA: 19.08
 * 6 mêses foram acima da média.
 * 
 */

