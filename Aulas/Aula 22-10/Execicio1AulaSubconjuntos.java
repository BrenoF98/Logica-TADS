public class Execicio1AulaSubconjuntos {
    public static void main(String[] args) {
        int[] v1 = { 1, 2, 3 };
        int[] v2 = { 2, 3, 6, 1 };
        int contContidos = 0;
        // faça um programa que identifique se v1 é subconjunto de v2

        for (int i = 0; i < v2.length; i++) {
            for (int j = 0; j < v1.length; j++) {
                if (v1[j] == v2[i]) {
                    System.out.println(v1[j] + " esta contido em v2");
                    contContidos++;
                }
            }

        }
        if (contContidos == v1.length) {
            System.out.println("é subconjunto de v2");
        }else {
            System.out.println("Não é subconjunto de v2");
        }
    }
}
