import java.util.Scanner;

public class Exerc32 {  
    
    /* 32. Conversão de segundos
            Solicite ao usuário uma quantidade inteira de segundos. Calcule e mostre o tempo no formato:

            horas:minutos:segundos
            Exemplo:

            Segundos informados: 3725
            Resultado: 1:2:5
            Utilize divisão inteira e o operador %.
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int segundos, segundosRest, minutos, minutosRest, horas ;

        System.out.print("Informe uma quatidade interira de segundos: ");
        segundos = scanner.nextInt();

        minutos = segundos / 60;
        segundosRest = segundos % 60;
        minutosRest = minutos % 60;
        horas = minutos / 60;

        System.out.println("Segundos informados: " + segundos);
        System.out.println("Resultado: " + horas + ":" + minutosRest + ":" + segundosRest);


   

        scanner.close();

    }
    
}
