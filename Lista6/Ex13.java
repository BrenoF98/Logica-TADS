package Lista6;

import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("randomizando entrada L:");
        int L = random.nextInt(10) + 1; 
        System.out.println("Número de linhas:" + L);
        System.out.println("randomizando entrada C:");
        int C = random.nextInt(10) + 1; 
        System.out.println("Número de Colunas:" + C);

        int [][] m = new int[L][C]; 
        int [] SL = new int[m.length];
        int [] SC = new int[m[0].length];

        System.out.print("\n\nMatriz: \n");

        for (int i = 0; i < m.length; i++) {
            
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = random.nextInt(-10,20);
                System.out.printf(" %3d", m[i][j]);
                SL [i] += m [i][j];
                SC [j] += m[i][j];
            }
            System.out.println();
        }


        System.out.print("\nVetor soma linha: SL = [ ");
        for (int i = 0; i < SL.length; i++) {
            if (i < SL.length - 1) {
                System.out.print(SL [i] + ", ");
            } else { 
                System.out.print(SL [i] + " ");

            }
        }
        System.out.print("]\n");
    
        System.out.print("\nVetor soma coluna: SC = [ ");
        for (int i = 0; i < SC.length; i++) {
            if (i < SC.length - 1) {
                System.out.print(SC [i] + ", ");
            } else { 
                System.out.print(SC [i] + " ");

            }
        }
        System.out.print("]\n\n");
    }
}
