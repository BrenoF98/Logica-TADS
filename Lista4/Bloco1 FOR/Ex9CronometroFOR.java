import java.util.Scanner;

public class Ex9CronometroFOR {
    public static void main(String[] args)  throws Exception {
        /*
         * 9. Conversao de segundos
         * Leia uma quantidade inteira positiva de segundos e, usando um for, mostre uma
         * contagem regressiva segundo a segundo ate zero. Ao final, mostre FIM.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor positivo em segundos: ");
        int segundosInformado = scanner.nextInt();
        if (segundosInformado > 0) {
            
            for (int i = segundosInformado; i >= 0; i--) {
                System.out.print("\033[H\033[2J");
                    System.out.flush();
                System.out.printf("\ncontagem -> %02d s\n", i);
                Thread.sleep(1000);
                if (i == 0) {
                    System.out.println("FIM!");
                }
            }
        }else {
            System.out.println("ERRO! Informe um valor positivo.");
        }
        scanner.close();
    }
}
