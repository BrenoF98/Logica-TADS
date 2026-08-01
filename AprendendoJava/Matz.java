public class Matz {
    public static void main(String[] args) {
        int[][] matriz = {
        {8, 9, 7},
        {6, 10, 5},
        {7, 8, 9}
    };


        // Imprimindo a matriz
        System.out.println("Matriz 3x3:");
        for (int linha = 0; linha < matriz.length; linha++) {
        for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
        System.out.print(matriz[linha][coluna] + " ");
        }
        System.out.println(); // pula linha ao terminar cada linha da matriz
        
        }
    }
}


    

