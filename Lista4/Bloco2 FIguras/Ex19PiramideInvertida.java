import java.util.Scanner;

public class Ex19PiramideInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe a altura n da piramide: ");
        int altura = scanner.nextInt();
        int base = altura * 2;

        for (int i = 0; i < altura; i++) {
            for (int j = base; j > 0; j--) {
                if (j >= base - i) {
                    System.out.print("_");
                } else if (j >= base + i ) {

                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        scanner.close();
    }
}
