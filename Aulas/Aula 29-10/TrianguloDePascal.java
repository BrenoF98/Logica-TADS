
public class TrianguloDePascal {
    public static void main(String[] args) {
        int[] v = { 1, 1 };
        
        while (true) {
            int[] prox = new int[v.length + 1];
            if (v.length == 12) break;
            // mostra o vetor v
            System.out.print("Saída final = { ");
            for (int j = 0; j < v.length; j++) {
                if (j != v.length - 1) {
                    System.out.printf("%d,", v[j]);
                } else {
                    System.out.printf("%d", v[j]);
                }
            }
            System.out.println(" }");


            for (int i = 1; i < prox.length - 1 ; i++) {
            prox[i] = v[i - 1] + v[i];
            }

            prox[0] = 1;
            prox[v.length] = 1;
            v = prox;
            
        }

        }

    }

