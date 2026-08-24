import java.util.Scanner;

public class Ex18MediaDuasNotas {
    public static void main(String[] args) {
        /*
         * 18. Média de duas notas
         * Leia duas notas, calcule a média e informe:
         * 
         * Aprovado: média >= 7;
         * Recuperação: média >= 5 e < 7;
         * Reprovado: média < 5.
         * Antes do cálculo, verifique se ambas as notas estão entre 0 e 10. Caso alguma
         * seja inválida, não calcule a média.
         */

        Scanner entrada = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("informe as duas notas");
        nota1 = entrada.nextFloat();
        if (nota1 >= 0 && nota1 <= 10) {
            nota2 = entrada.nextFloat();
            if (nota2 >= 0 && nota2 <= 10) {

                media = (nota1 + nota2) / 2;
                
                if (media >= 7) {
                    System.out.println("Aprovado");
                }else if (media >= 5) {
                    System.out.println("Recuperação");
                    
                }else {
                    System.out.println("Reprovado");
                }

            } else {
                System.out.println("Nota invalida");
            }

        } else {
            System.out.println("Nota invalida");
        }

        entrada.close();

    }
}
