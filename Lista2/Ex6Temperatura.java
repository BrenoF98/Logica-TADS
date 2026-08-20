import java.util.Scanner;

public class Ex6Temperatura {
/* 6. Temperatura

Leia uma temperatura em graus Celsius. Informe "Temperatura elevada" 
quando ela for maior que 30 graus e "Temperatura normal" caso contrário. */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        float temperatura = entrada.nextFloat();

        if (temperatura > 30){

            System.out.println("Temperatura elevada!");
            
        } else {
            
            System.out.println("Temperatura normal!");
            
        }

        entrada.close();
    }
}
