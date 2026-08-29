
import java.util.Scanner;

public class Repeticao5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // calcule o somatorio do intervado x,y onde x e y são informados usuario.

        int valorX = entrada.nextInt(), valorY = entrada.nextInt(), somatorio = 0;

        System.out.println("A soma de " + valorX + " até " + valorY);

        if (valorX < valorY) {
            while (valorX <= valorY) {
                somatorio = valorX + somatorio;
                valorX++;
            }
        } else {
            System.out.println("Erro! X deve ser menor que Y.");
        }

        System.out.println(somatorio);
        entrada.close();
    }
}
