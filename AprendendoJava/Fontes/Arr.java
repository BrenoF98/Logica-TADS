import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
//            System.out.println("Número na posição " + i + ": " + numeros[i]);

        }
        
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i] > maior) {
                maior = numeros[i];

            
            }
        }

        System.out.println("O maior número é: " + maior);

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma dos números é: " + soma);

        double media = (double) soma / numeros.length;
        System.out.println("A média dos números é: " + media); //

      scanner.close(); // Fechar o scanner para liberar recursos
    }
}

