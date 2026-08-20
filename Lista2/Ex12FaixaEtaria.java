import java.util.Scanner;

public class Ex12FaixaEtaria {
    /*
     * 12. Classificação por idade
     * 
     * Leia a idade de uma pessoa e classifique-a como:
     * 
     * Criança: de 0 a 11 anos;
     * Adolescente: de 12 a 17 anos;
     * Adulto: de 18 a 59 anos;
     * Idoso: 60 anos ou mais.
     * Caso a idade seja negativa, informe que o valor é inválido.
     * 
     * Adicionado limite de idade até 130 anos, pois não existe pessoa mais velha
     * que isso no mundo.
     * 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade = entrada.nextInt();

        if (idade >= 0 && idade <= 130) {

            if (idade <= 11) {
                System.out.println("Criança");
            } else if (idade <= 17) {
                System.out.println("Adolescente");
            } else if (idade <= 59) {
                System.out.println("Adulto");
            } else if (idade >= 60) {
                System.out.println("Idoso");
            }

        } else {
            System.out.println("Valor invalido!");

        }

        entrada.close();
    }
}
