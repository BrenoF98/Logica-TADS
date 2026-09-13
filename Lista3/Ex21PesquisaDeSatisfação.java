import java.util.Scanner;

public class Ex21PesquisaDeSatisfação {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inicia variaiveis de processamento.

        int quantEntradasVaridas = 0, quantEntradasInvalidas = 0, mediaNotas = 0, quantNotas1 = 0, quantNotas5 = 0, somaNotas = 0;

        int nota  = 1; // inicia variavel com valor verdadeiro para o while principal. 

        while (nota != 0) {

            // entradas
            System.out.print("\nDe uma nota de 1 a 5 para o serviço prestado: ");
            nota = sc.nextInt();
            
            if (nota > 0 && nota <= 5) {
                quantEntradasVaridas++; // conta notas validas

                if (nota == 1) {
                    quantNotas1++; // conta notas 1 
                } 
                
                if (nota == 5) { // conta notas 5
                    quantNotas5++;                    
                }

                somaNotas += nota;

            } else if (nota != 0){
                quantEntradasInvalidas++; // conta notas invalidas

                System.out.println("Informe uma nota valida, de 1 a 5, sendo 1 pessimo e 5 otimo.");
            }

        }

        mediaNotas = somaNotas / quantEntradasVaridas;

        System.out.println("Quantidade de respostas válidas: " + quantEntradasVaridas);
        System.out.println("Média das notas: " + mediaNotas);
        System.out.println("Quantidade de notas 1: " + quantNotas1);
        System.out.println("Quantidade de notas 5: " + quantNotas5);
        System.out.println("Quantidade de entradas inválidas: " + quantEntradasInvalidas);

        sc.close();
    }
}