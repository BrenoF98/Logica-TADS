import java.util.Scanner;

public class Ex5IngressoDeCinema {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;

        float precoNormalIngresso, desconto = 0, precoFinal = 0;

        String estudante;

        System.out.println("Informe a idade: ");

        idade = entrada.nextInt();

        if (idade > 0 && idade < 120) { // 120 pois não há pessoa, hoje, mais velha que isso.
            System.out.println("É estudante? (sim ou não)");
            estudante = entrada.next();

            if (estudante.equalsIgnoreCase("sim") || estudante.equalsIgnoreCase("não")) {

                System.out.println("Informe o preço normal do ingresso: ");

                precoNormalIngresso = entrada.nextFloat();

                if (idade < 12 || idade >= 60) {

                    desconto = 0.5f;

                } else if (estudante.equalsIgnoreCase("sim")) {
                    desconto = 0.5f;

                }

                precoFinal = precoNormalIngresso - (precoNormalIngresso * desconto);

                System.out.println("Preço do ingresso: " + precoFinal);

            } else {
                System.out.println("Informação Invalidade, responda sim ou não!");
            }
        } else {
            System.out.println("Essa idade não é valida!");
        }
        entrada.close();
    }
}
