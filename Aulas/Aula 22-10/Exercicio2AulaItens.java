import java.util.Scanner;

public class Exercicio2AulaItens {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // faça um programa que tem dois vetories de mesmo tamanhã. Um de string com
        // nomes dos produtos e outro com preço.

        /*
         * O programa deve pedir ao usuario:
         * 
         * 1. numero do itens do menu
         * 2. quantidade de cada item
         * 3. Somar a quantidade de itens
         * 4. guardar em uma string todas as decições do usuario para mostrar o pedido
         * todo.
         */

        String[] item = { 
            "arroz", 
            "feijao", 
            "Macarrao", 
            "iogurte" 
        };

        float[] precoUnidade = { 
            5f, 
            5.25f, 
            3.10f, 
            4.50f 
        };

        int valorMenu, quantItem;
        int totalDeItens = 0;
        int precoTotal = 0;

        String pedido = "";

        System.out.println();
        System.out.println("Itens disponiveis: ");
        for (int i = 0; i < precoUnidade.length; i++) {
            System.out.printf("%d |-> %s --> valor un. %.2f\n", i, item[i], precoUnidade[i]);
        }
        do {

            float preco = 0;

            System.out.print("\nInforme o numero do produto: ");
            valorMenu = scanner.nextInt();
            
            if (valorMenu == -1)
                break;

            switch (valorMenu) {
                case 0:
                    System.out.print("\nInforme a quantidade do produto escolido: ");
                    quantItem = scanner.nextInt();

                    preco = quantItem * precoUnidade[valorMenu];
                    pedido += item[valorMenu] + " -> " + quantItem + " preço: R$ " + preco + "\n";
                    totalDeItens += quantItem;
                    precoTotal += preco;
                    break;
                case 1:
                    System.out.print("Informe a quantidade do produto escolido: ");
                    quantItem = scanner.nextInt();

                    preco = quantItem * precoUnidade[valorMenu];
                    pedido += item[valorMenu] + " -> " + quantItem + " preço: R$ " + preco + "\n";
                    totalDeItens += quantItem;
                    precoTotal += preco;

                    break;
                case 2:
                    System.out.print("Informe a quantidade do produto escolido: ");
                    quantItem = scanner.nextInt();

                    preco = quantItem * precoUnidade[valorMenu];
                    pedido += item[valorMenu] + " -> " + quantItem + " preço: R$ " + preco + "\n";
                    totalDeItens += quantItem;
                    precoTotal += preco;

                    break;
                case 3:
                    System.out.print("Informe a quantidade do produto escolido: ");
                    quantItem = scanner.nextInt();

                    preco = quantItem * precoUnidade[valorMenu];
                    pedido += item[valorMenu] + " -> " + quantItem + " preço: R$ " + preco + "\n";
                    totalDeItens += quantItem;
                    precoTotal += preco;

                    break;

                default:
                    System.out.println("Valor invalido!");
                    break;
            }

        } while (valorMenu != -1);

        System.out.println("\nPedido do cliente\n" + pedido + "\nValor total: " + precoTotal
                + "\nQuantidade total de itens: " + totalDeItens);

        scanner.close();
    }
}
