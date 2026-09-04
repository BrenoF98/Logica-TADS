import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int numero, contadorDeDigitos = 0;

        numero = entrada.nextInt();
        while (numero > 0) {
            int digito = numero % 10;

            
            contadorDeDigitos++;
            numero = numero / 10;
            System.out.println("Digito: " + digito);
            System.out.println("Número: " + numero);

            
        }
        System.out.println("Quantidade de digitos: " + contadorDeDigitos);
        entrada.close();
    }
}
