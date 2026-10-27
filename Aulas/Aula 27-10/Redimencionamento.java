import java.util.Scanner;

public class Redimencionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[0];

        
        while (true) {
            System.out.println("""
    
                        1. VER VETOR
                        2. REDIMENCIONAR
                        3. COLOCAR VALOR EM POSIÇÃO
                        4. SAIR
    
                    """);
            System.out.print("Informe a opção: ");
            int opcao = scanner.nextInt();
            if (opcao == 4)
                break;

            switch (opcao) {
                case 1:
                    // mostrar vetor
                    System.out.print("\nVetor = { ");
                    for (int i = 0; i < vetor.length; i++) {
                        if (i != vetor.length - 1) {
                            System.out.printf("%d, ", vetor[i]);
                        } else {
                            System.out.printf("%d", vetor[i]);
                        }
                    }
                    System.out.print(" }\n\n");
                    break;
                case 2:
                    // redimencionar o vetor mandento os valores atuais
                    int tamanhoDesejado;
                    
                    System.out.print("informe o novo tamanho do vetor: ");
                    tamanhoDesejado = scanner.nextInt();
                    int[] vetorCopia = new int[tamanhoDesejado];


                    for (int i = 0; i < vetor.length && i < vetorCopia.length; i++) {
                        vetorCopia[i] = vetor[i];
                        System.out.println(vetorCopia[i]);
                    }
                    
                    vetor = vetorCopia;

                    break;
                case 3:
                    // perguntar a posição e o valor e colocar no vetor

                    System.out.print("Informe a posição e o valor para ser adicionado ao vetor: ");
                    int idx = scanner.nextInt();
                    if (idx >= 0 && idx < vetor.length) {
                        int valorsub = scanner.nextInt();
                        vetor [idx] = valorsub;
                    } else { 
                        System.out.println("Posição Invalida!");
                    }

                    break;

                default:
                    System.out.println("Opção invalida.");
                    break;
            }

        }
        scanner.close();
    }
}
