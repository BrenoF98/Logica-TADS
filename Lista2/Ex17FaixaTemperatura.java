import java.util.Scanner;

public class Ex17FaixaTemperatura {
    /*
     * Leia uma temperatura em graus Celsius e classifique:
     * 
     * abaixo de 0: Congelante;
     * de 0 a 15: Frio;
     * acima de 15 até 25: Agradável;
     * acima de 25 até 35: Quente;
     * acima de 35: Muito quente.
     * 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe Temperatura em °C: ");
        float Temperatura = entrada.nextFloat();
        if (Temperatura < 0 ) {
            System.out.println("Congelante");
        } else if (Temperatura <= 15) {

            System.out.println("Frio");

        } else if (Temperatura <= 25) {

            System.out.println("Agradavel");
        } else if (Temperatura <= 35){

            System.out.println("Quente");

        } else {
            System.out.println("Muito quente");
        }

        entrada.close();
    }
}
