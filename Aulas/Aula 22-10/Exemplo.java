
import java.io.File;
import java.util.Random;
import java.util.Scanner;;

public class Exemplo {

    public static void main(String[] args) throws Exception{
        String [] palavras = new String[1000];
        Scanner scanner = new Scanner(new File("D:\\TADS\\Java_log_prog\\Logica-TADS\\Aulas\\Aula 22-10\\palavras.txt"));
        
        int idx = 0; // index
        while (scanner.hasNext()) {
            palavras[idx] = scanner.next();
            idx++;
        }

        System.out.println("palavras carregadas " + idx);
/*  
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }
*/

        Random randomizador = new Random();
        int posicaoSorteada = randomizador.nextInt(1000);

        String sorteada = palavras[posicaoSorteada];

        System.out.println(sorteada);

        // toda string é na verdade um vetor de letras. 
        
        char [] letras = sorteada.toCharArray();

        scanner = new Scanner(System.in);
        
        for (int i = 0; i < letras.length; i++) {
            System.out.println("letras[" + i + "] = " + letras[i]);
        }

        scanner.close();


    }
}