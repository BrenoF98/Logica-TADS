import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1, numero2, mult, div, ads, subt, resto;
        
        System.out.print("Dois números: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        // System.out.print("Escreva outro número diferente de 0: ");
        // numero2 = sc.nextInt();

        mult = numero1 * numero2;
        div = numero1 / numero2; 
        resto = numero1 % numero2;
        subt = numero1 - numero2;
        ads = numero1 + numero2;

        System.out.println("O primeiro número foi: " +numero1 + "\nO seugndo numero foi: " + numero2);
        System.out.println("Adição ente o primeiro e o segundo numeor: " + ads);
        System.out.println("Subtração ente o primeiro e o segundo numeor: " + subt);
        System.out.println("Multiplicação ente o primeiro e o segundo numeor: " + mult);
        System.out.println("divisão ente o primeiro e o segundo numeor: " + div);
        System.out.println("Resto ente o primeiro e o segundo numeor: " + resto);
        
        sc.close();




        
    }
}
