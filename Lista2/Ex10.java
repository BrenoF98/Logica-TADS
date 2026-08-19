import java.util.Scanner;

public class Ex10 {

    /* 10. Comparação entre dois valores
Leia dois números inteiros e informe qual deles é o maior. 
Caso sejam iguais, informe "Valores iguais". */

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int valor1, valor2;

        System.out.println("Informe dois valores interiro a serem comprados: ");
        valor1 = entrada.nextInt();
        valor2 = entrada.nextInt();
        
        if (valor1 == valor2) {
            
            System.out.println("Os valores são iguais: ");
            
            
        } else if (valor1 > valor2) {
            
            System.out.println(valor1 + " é maior que " + valor2);
            
        } else {
            
            System.out.println(valor2 + " é maior que " + valor1);
        }

        entrada.close();

    }
    
}
