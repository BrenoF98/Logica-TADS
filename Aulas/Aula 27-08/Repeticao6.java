

import java.util.Scanner;

public class Repeticao6 {
    public static void main(String[] args) {
        // faça um programa que solicite a senha certa (use int) até que o usuario
        // acerte!
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a senha (Int.)");
        int senha = entrada.nextInt();

        while (senha != 1234) {
            System.out.println("Tente novamente!");
            System.out.println("Informe a senha (Int.)");
            senha = entrada.nextInt();
        }

        if (senha == 1234) {
            System.out.println("Senha correta!!!!!!!");
            
        }
    }
}
