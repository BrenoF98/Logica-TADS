import java.util.Scanner;

public class ConversorBases {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opcao:");
        System.out.println("1 - Gerar tabela de 0 ate n");
        System.out.println("2 - Converter um valor especifico");
        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();

        int inicio = 0;
        int fim = 0;

        if (opcao == 1) {
            System.out.print("Digite o valor limite (n): ");
            fim = scanner.nextInt();
            inicio = 0;
        } if (opcao == 2) {
            System.out.print("Digite o valor especifico: ");
            int valor = scanner.nextInt();
            inicio = valor;
            fim = valor;
        }

        // Descobre quantos bits o maior número do intervalo precisa
        int bitsNecessarios = 0;
        int tempN = fim;
        while (tempN > 0) {
            bitsNecessarios++;
            tempN = tempN / 2;
        }

        // Garante pelo menos 1 bit caso o fim seja 0
        if (bitsNecessarios == 0) {
            bitsNecessarios = 1;
        }

        // Imprime o cabeçalho da tabela formatado
        System.out.printf("%-10s %-12s %-8s %-6s%n", "Decimal", "Binario", "Octal", "Hexa");

        int i = inicio;
        while (i <= fim) {
            
            // 1. Conversão para Binário
            String binario = "";
            int tempBin = i;
            
            if (tempBin == 0) {
                binario = "0";
            } else {
                while (tempBin > 0) {
                    int resto = tempBin % 2;
                    binario = resto + binario;
                    tempBin = tempBin / 2;
                }
            }

            // Preenche com zeros à esquerda até atingir o número total de bits
            while (binario.length() < bitsNecessarios) {
                binario = "0" + binario;
            }

            // 2. Conversão para Octal
            String octal = "";
            int tempOct = i;

            if (tempOct == 0) {
                octal = "0";
            } else {
                while (tempOct > 0) {
                    int resto = tempOct % 8;
                    octal = resto + octal;
                    tempOct = tempOct / 8;
                }
            }

            // 3. Conversão para Hexadecimal
            String hexa = "";
            int tempHex = i;

            if (tempHex == 0) {
                hexa = "0";
            } else {
                while (tempHex > 0) {
                    int resto = tempHex % 16;
                    
                    if (resto == 10) {
                        hexa = "A" + hexa;
                    } if (resto == 11) {
                        hexa = "B" + hexa;
                    } if (resto == 12) {
                        hexa = "C" + hexa;
                    } if (resto == 13) {
                        hexa = "D" + hexa;
                    } if (resto == 14) {
                        hexa = "E" + hexa;
                    } if (resto == 15) {
                        hexa = "F" + hexa;
                    } if (resto < 10) {
                        hexa = resto + hexa;
                    }
                    
                    tempHex = tempHex / 16;
                }
            }

            // Exibe a linha usando printf formatado
            System.out.printf("%-10d %-12s %-8s %-6s%n", i, binario, octal, hexa);

            i++;
        }

        scanner.close();
    }
}