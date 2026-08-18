import java.util.Scanner;
public class media {
    public static void main(String[] args) {

        float n1, n2, media;
        Scanner entrada = new Scanner(System.in);

        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();

        media = (n1 + n2) / 2;
        System.out.println("A média é: " + media);

/*         if (media >= 7) {
            System.out.println("Aprovado!");
        } 
        if (media > 3 && media < 7) {
            System.out.println("Recuperação!");
        }
        if (media <= 3) {
            System.out.println("Reprovado!");
        } */

            if (media >= 7) {
                System.out.println("Aprovado!");
            } else if (media > 3) { // se eu testar novamente o >= 7 novamente pode causar problemas depois. 
                System.out.println("Recuperação!");
            } else { // senão nunca tem condição. 
                System.out.println("Reprovado!");}



        entrada.close();
    }
}
