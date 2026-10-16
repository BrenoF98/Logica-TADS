import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {

        // jogo da forca?

        Scanner scanner = new Scanner(System.in);

        System.out.print("Infomre o número de letras da palavra: ");

        int numChar = scanner.nextInt();

        String[] forca = new String[numChar];
        String[] recebeForca = new String[numChar];
        String chute;

        int cont = 0;

        for (int i = 0; i < forca.length; i++) {
            System.out.println("Informe a palabra, sepando cada letra: ");
            forca[i] = scanner.next();
        }

        do {


            System.out.print("Chute uma letra: ");
            chute = scanner.next();
            
            for (int j = 0; j < recebeForca.length; j++) {
                
                if (forca[j].equalsIgnoreCase(chute)) {
                    recebeForca[j] = chute;
                }
            }
            
            for (int k = 0; k < forca.length; k++) {
                System.out.printf("|%s", recebeForca[k]);
            }
            System.out.print("| \n");
            
            if (chute.equalsIgnoreCase("sair"))
                break;
            cont++;
            
        } while (!chute.equalsIgnoreCase("sair") && cont < 5);

        scanner.close();

    }
}
