import java.util.Scanner;

public class Ex49RelatorioDeChamdo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * 49. Relatorio de chamados
         * Leia codigos de chamados ate a opcao de encerramento. Use switch para
         * classificar cada chamado como duvida, erro, solicitacao ou outro. Ao final,
         * informe a quantidade de cada categoria e o total recebido.
         */

        int codigo, contDuvidas = 0, contErro = 0 , contOutros=0, contSolicitacoes=0, totalDeChamados=0;

        do {

            System.out.print("""
                        ===     MENU DE CHAMADOS     ===

                            Codigo 100 -> Duvidas.
                            Codigo 404 -> Erro.
                            Codigo 131 -> Solicitações.
                            Codigo 200 -> Outros.
                            Codigo 000 -> Finalizar.

                        ===     ================     ===
                    """);

            codigo = scanner.nextInt();

            switch (codigo) {
                case 100:
                    System.out.println("Chamdo de DUVIDA aberto!");
                    contDuvidas++;
                    break;
                case 404:
                    System.out.println("Chamdo de ERRO aberto!");
                    contErro++;
                    break;

                case 131:
                    System.out.println("Chamdo de SOLICITAÇÃO aberto!");
                    contSolicitacoes++;
                    break;
                case 200:
                    System.out.println("Chamdo não especificado aberto!");
                    contOutros++;
                    break;
                case 000:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Codigo não identificado.");
                    break;
            }

        } while (codigo != 0);

        totalDeChamados = contDuvidas + contErro + contOutros + contSolicitacoes;

        System.out.printf("""
                        ===+++   Relatorio de Chamados   +++===

                            Codigo 100 -> Duvidas -> %d
                            Codigo 404 -> Erro -> %d
                            Codigo 131 -> Solicitações -> %d
                            Codigo 200 -> Outros -> %d
                            ============================
                            Quantidade total de chamado -> %d

                        ===+++    =====================   +++===
                    """, contDuvidas, contErro, contSolicitacoes, contOutros, totalDeChamados);
        
        scanner.close();
    }
}
