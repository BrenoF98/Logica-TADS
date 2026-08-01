public class LacoFor {
    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("Laço For contador de 1 a 10.");

        for (int contador = 1; contador <=10; contador++){ // Criando um laço for que inicia a variável contador em 1, e enquanto contador for menor ou igual a 10, ele incrementa contador em 1 a cada iteração.

            System.out.println("Contador: " + contador); // Essa linha imprime o valor da variável contador a cada iteração do laço.
        }

        System.out.println("Fim do programa");
        System.out.println("================================");
        System.out.println("Laço For contando os números pares de 1 a 10.");

        /*  Esse for visita dotos os numeros de 1 a 10, mas só imprime os números pares, descarta os ímpares. 
            Isso faz perder desempenho, pois o for está visitando todos os números, mas só imprimindo os pares.
        
        for (int contador = 1; contador <=10; contador++){ //esa linha cria um laço for que inicia a variável contador em 1, e enquanto contador for menor ou igual a 10, ele incrementa contador em 1 a cada iteração.
            
            if (contador % 2 == 0){ // Essa linha verifica se o valor da variável contador é par, ou seja, se o resto da divisão de contador por 2 é igual a 0. Se for, ele entra no bloco if e imprime o valor de contador.
                System.out.println("Contador " + contador);
            }
        } */

            // Esse for visita apenas os números pares de 1 a 10, imprimindo apenas os números pares.

        for (int contador = 2; contador <=10; contador+=2){ //Essa linha cria um laço for que inicia a variável contador em 2, e enquanto contador for menor ou igual a 10, ele incrementa contador em 2 a cada iteração, assim visitando apenas os números pares.
            
                System.out.println("Contador " + contador);
        }
        System.out.println("Fim do programa");
        System.out.println("================================");
    }
}

