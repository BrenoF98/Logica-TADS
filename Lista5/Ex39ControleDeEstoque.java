package Lista5;

import java.util.Scanner;

public class Ex39ControleDeEstoque {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
         * Exercício 39 — Controle de estoque com vetores
         * Uma pequena loja possui 8 produtos, identificados pelos códigos de 1 a 8.
         * 
         * Crie um vetor que armazene a quantidade disponível de cada produto.
         * 
         * Inicialmente, o usuário deverá informar o estoque de todos os produtos,
         * utilizando apenas quantidades não negativas.
         */
        int[] estoque = new int[8];

        for (int i = 0; i < estoque.length; i++) {
            System.out.println("Informe a quantidade do protudo " + (i + 1) + ":");
            int estoqueInformado = scanner.nextInt();

            if (estoqueInformado >= 0) {
                estoque[i] = estoqueInformado;
            } else {
                System.out.println("Quantidade invalida. Tente novamente. ");
                i--;
            }
        }

        /*
         * Após a leitura inicial, apresente um menu com as seguintes operações:
         * 
         * 1. Consultar o estoque de um produto.
         * 2. Registrar a entrada de uma quantidade de unidades.
         * 3. Registrar a venda de uma quantidade de unidades.
         * 4. Listar todos os produtos e seus estoques.
         * 5. Apresentar o produto com a maior quantidade em estoque.
         * 6. Encerrar o programa.
         * 
         * As vendas somente deverão ocorrer quando houver estoque suficiente. Entradas
         * e vendas deverão utilizar quantidades inteiras positivas.
         * 
         * Após cada operação, o programa deverá retornar ao menu, até que o usuário
         * escolha encerrar.
         * 
         */
        int quantAdd = 0, quantComp = 0, idx;
        int idxMaior = 0, maior = 0;
        boolean sair = false;
        do {

            System.out.printf("""
                    ================= MENU =================

                        1. Consultar um Produto
                        2. Entrata
                        3. Venda
                        4. Lista Todos Produtos
                        5. Produto com Maior Quantidade
                        6. SAIR.

                    ================= ---- =================
                    """);
            System.out.print("Informe uma opção: ");
            int op = scanner.nextInt();

            switch (op) {
                case 1: // 1. Consultar o estoque de um produto.

                    while (true) {
                        System.out.print("Informe o produto a ser consultado (1 - 8): ");
                        idx = scanner.nextInt();
                        if (idx >= 1 && idx <= 8) {
                            System.out.println("\nEstaque atual do produto " + (idx) + ": " + estoque[idx - 1] + "\n");
                            break;
                        } else {
                            System.out.println("Erro!");
                        }
                    }
                    break;

                case 2: // 2. Registrar a entrada de uma quantidade de unidades.
                    while (true) {

                        System.out.println("Informe o produto (1 - 8) e a quantidade adicionada: ");
                        idx = scanner.nextInt() - 1;

                        quantAdd = scanner.nextInt();
                        if (quantAdd > 0) {
                            estoque[idx] += quantAdd;
                            break;
                        } else {
                            System.out.println("Erro! Informe um valor maior que ZERO.");
                        }

                    }

                    break;
                case 3: // 3. Registrar a venda de uma quantidade de unidades.
                    while (true) {

                        System.out.println("Informe o produto (1 - 8) e a quantidade desejada: ");
                        idx = scanner.nextInt() - 1;
                        if (estoque[idx] > 0) {
                            quantComp = scanner.nextInt();
                            if (quantComp > 0 && estoque[idx] >= quantComp) {
                                estoque[idx] -= quantComp;
                                break;

                            } else {
                                System.out.println("Erro! Estoque insuficiente ou quantidade invalida.");
                            }
                        } else {
                            System.out.println("Sem estoque!");
                            break;
                        }

                    }

                    break;
                case 4: // 4. Listar todos os produtos e seus estoques.
                    System.out.println();
                    for (int i = 0; i < estoque.length; i++) {
                        System.out.println("Produto " + (i + 1) + ": " + estoque[i]);
                    }
                    System.out.println();
                    break;
                case 5: // 5. Apresentar o produto com a maior quantidade em estoque.
                    for (int i = 0; i < estoque.length; i++) {
                        if (estoque[i] > maior) {
                            maior = estoque[i];
                            idxMaior = i;
                        }
                    }
                    System.out.println(
                            "O item com maior estoque é o produto " + (idxMaior + 1) + " -> " + maior + " un.");
                    break;

                case 6: // Encerrar o programa.
                    System.out.println("Saindo...");
                    sair = true;
                    break;

                default:
                    break;
            }

        } while (!sair);

        scanner.close();
    }
}
