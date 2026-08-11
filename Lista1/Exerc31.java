import java.util.Scanner;
public class Exerc31 {
    /* 31. Conversão de minutos

            Solicite ao usuário uma quantidade inteira de minutos. Calcule e mostre:

            a quantidade de horas completas;
            a quantidade de minutos restantes.
            Exemplo:

            Minutos informados: 135
            Horas: 2
            Minutos restantes: 15
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minutos, horas, minutosRest;

        System.out.print("Informe uma quatidade interira de minutos: ");
        minutos = scanner.nextInt();
        
        horas = minutos / 60;
        
        minutosRest = minutos % 60;
        
        System.out.println("Minutos informados: " + minutos);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos restantes " + minutosRest);



        scanner.close();
        


    }
}
