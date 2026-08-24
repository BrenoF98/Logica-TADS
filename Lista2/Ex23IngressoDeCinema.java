import java.util.Scanner;

public class Ex23IngressoDeCinema {

    /*
     * 23. Ingresso de cinema
     * Leia a idade do cliente, informe se ele é estudante ("S" ou "N") e leia o
     * preço normal do ingresso.
     * 
     * Regras:
     * 
     * menores de 12 anos pagam 50%;
     * pessoas com 60 anos ou mais pagam 50%;
     * entre 12 e 59 anos, estudantes pagam 50%;
     * demais clientes pagam o preço integral.
     * A idade não pode ser negativa e a opção de estudante deve ser válida.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float idade, precoNormalIngresso = 0, percentDesconto;

        System.out.println("Informe a sua idade: ");
        idade = entrada.nextFloat();

        if (idade > 0) {
            String estuda;
            System.out.println("Você é estaudando (S -> SIM ou N -> NÃO) ");
            estuda = entrada.next();
            System.out.println("Preço inteiro do ingresso: ");
            precoNormalIngresso = entrada.nextFloat();

            if (idade < 12) {
                percentDesconto = .5f;
            } else if (idade >= 12 && idade < 60) {

                if (estuda.equalsIgnoreCase("S")) {
                    percentDesconto = 0.5f;
                    
                }else if (estuda.equalsIgnoreCase("N")) {
                    percentDesconto = 0;
                    
                } else if (idade >= 60) {
                    
                } else {
                    System.out.println("ERRO! Digite S ou N");
                }
                
            }

        }else {
            System.out.println("A idade invalida!");
        }

        entrada.close();
    }
}
