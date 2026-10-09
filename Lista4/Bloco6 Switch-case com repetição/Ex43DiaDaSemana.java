import java.util.Scanner;

public class Ex43DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        String diaDaSemana = "";

        do {

            System.out.print("Informe um valor entre 1-7: ");
            num = scanner.nextInt();

            
            switch (num) {
                case 1:
                    diaDaSemana = "Domingo";

                    break;
                case 2:
                    diaDaSemana = "Segunda-feira";
     
                    break;
                case 3:
                    diaDaSemana = "Terça-feira";
                    
                    break;
                case 4:
                    diaDaSemana = "Quarta-feira";
                    
                    break;
                case 5:
                    diaDaSemana = "Quinta-feira";
                    
                    break;
                case 6:
                    diaDaSemana = "Sexta-feira";
                    
                    break;
                case 7:
                    diaDaSemana = "Sábado";
                    
                    break;
                case 0:
                    System.out.println("Finalizando...");
                    break;
            
                default:
                    System.out.println("Valor invalido!");
            }

            if (num > 0 && num <= 7) {
                System.out.printf("\n%d representa %s.\n", num, diaDaSemana);
            }
                

        } while (num != 0);
        
        scanner.close();
    }
}
