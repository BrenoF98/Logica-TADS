import java.util.Scanner;

public class Ex00IASistemaDeTriagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // dados de entrada.

        float pesoAnimal = 1; // inicial variavel com valor valido para o while principal. Não afeta
                              // processamento pois o primeiro passo dentro do laço de repetição solicita um
                              // novo valor para essa variavel.
        String tipoDeAnimal = "";
        String nivelDeUrgencia = "";

        // variaveis de controle e processamento.

        int quantAnimaisAtendidos = 0;
        int quantNivelAlto = 0;
        int quantTentativasInvalidas = 0;
        float valorTotalArrecadado = 0;
        float maiorArrecadado = Float.MIN_VALUE;

        // formatação de saida
        int quantAtendimentosIniciados = 0;

        while (pesoAnimal != 0) {

            

            quantAtendimentosIniciados++;
            System.out.printf("\n================ Atendimento %04d ================\n", quantAtendimentosIniciados);

            System.out.printf("\nInforme o peso do animal em kg: ");
            pesoAnimal = sc.nextFloat();

            if (pesoAnimal != 0) {
                
                System.out.printf("\nInfome o tipo do paciente (CACHORRO, GATO ou AVE): ");
                tipoDeAnimal = sc.next();
                System.out.printf("\nInfome o nível de urgência (BAIXA ou ALTA): ");
                nivelDeUrgencia = sc.next();
                
                // flag de validação de entrada.
    
                boolean pesoValido = false;
                boolean tipoValido = false;
                boolean nivelValido = false;
    
                if (pesoAnimal > 0) {
                    pesoValido = true;
                }
                if (tipoDeAnimal.equalsIgnoreCase("CACHORRO") || tipoDeAnimal.equalsIgnoreCase("GATO")
                        || tipoDeAnimal.equalsIgnoreCase("AVE")) {
                    tipoValido = true;
                }
                if (nivelDeUrgencia.equalsIgnoreCase("BAIXA") || nivelDeUrgencia.equalsIgnoreCase("ALTA")) {
                    nivelValido = true;
                }
    
                float valorBase = 150.00f; // reiniciar o valor vase para cada cliente.
    
                if (pesoValido && tipoValido && nivelValido) {
    
                    quantAnimaisAtendidos++;
    
                    if (tipoDeAnimal.equalsIgnoreCase("CACHORRO")) {
                        if (pesoAnimal > 20.00f) {
                            valorBase += 30.00f;
                        }
    
                    } else if (tipoDeAnimal.equalsIgnoreCase("GATO")) {
    
                        valorBase -= (valorBase * .15f);
    
                    } else if (tipoDeAnimal.equalsIgnoreCase("AVE")) {
                        valorBase = 90.00f;
                    }
    
                    if (nivelDeUrgencia.equalsIgnoreCase("ALTA")) {
                        quantNivelAlto++;
                        valorBase += (valorBase * .2f);
                    }
    
                    System.out.printf(
                            "\n\nTipo do Animal: %S\nPeso: %.3f kg\nNível de Urgencia: %S\nPreço da consulta: R$ %.2f\n",
                            tipoDeAnimal, pesoAnimal, nivelDeUrgencia, valorBase);
    
                } else {
                    quantTentativasInvalidas++;
                    System.out.println("\nAtendimento Recusado!");
                    if (!pesoValido) {
                        System.out.println("Peso inválido.");
                    }
                    if (!tipoValido) {
                        System.out.println("Tipo de paciente desconhecido");
                    }
                    if (!nivelValido) {
                        System.out.println("Nível de urgência inválida");
                    }
    
                    valorTotalArrecadado += valorBase;
    
                    if (maiorArrecadado <= valorBase) {
                        maiorArrecadado = valorBase;
                    }
    
                }
            }

        }

        System.out.println("\n================ RELATÓRIO FINAL ================\n");

        System.out.println("Quantidade total de animais atendidos com sucesso: " + quantAnimaisAtendidos);
        System.out.println("Quantidade de atendimentos de urgência \"ALTA\": " + quantNivelAlto);
        System.out.println(
                "Quantidade de tentativas de atendimento recusadas por dados inválidos: " + quantTentativasInvalidas);
        System.out.printf("Valor total arrecadado no dia pela clínica: %.2f\n", valorTotalArrecadado);
        System.out.printf("Maior valor cobrado em uma única consulta válida: %.2f\n", maiorArrecadado);

        sc.close();
    }
}
