import java.util.Scanner;

public class Ex30VerificandoTriangulos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // entrada -> 3 valores, lados do triangulo
        float ladoA, ladoB, ladoC;

        System.out.println("Informe os lados do triangulo: (ex. (2 4 6))");
        ladoA = entrada.nextFloat();
        ladoB = entrada.nextFloat();
        ladoC = entrada.nextFloat();

        // processamento

        float somaLados;

        String tipoTriangulo = "";

        boolean formaTriangulo = false;

        // Precisam ser positivos

        if (ladoA > 0 && ladoB > 0 && ladoC > 0) {
            /*
             * podem formar um triangulo?
             * 
             * (Para formar um triangulo a soma de dois lado
             * precisa ser maior que o terceiro)
             * 
             * Sabendo disso, é possivel afirmar que SE o maior lado for mais que a soma
             * dos
             * outors dois os valores podem consituir um triangulo. Sem a necessidade de
             * verificar as outras combinações.
             */

            if (ladoA > ladoB && ladoA > ladoC) {
                somaLados = ladoB + ladoC;
                if (ladoA < somaLados) {
                    formaTriangulo = true;

                } else {
                    formaTriangulo = false;
                }
            } else if (ladoB > ladoC) {
                somaLados = ladoA + ladoC;
                if (ladoB < somaLados) {
                    formaTriangulo = true;
                } else {
                    formaTriangulo = false;
                }

            } else { // ou eles são igual ou o C é o maior.
                somaLados = ladoA + ladoB;
                if (ladoC < somaLados) {
                    formaTriangulo = true;
                    if (ladoC == ladoB && ladoC == ladoA) {
                        tipoTriangulo = "Equilátero";
                        formaTriangulo = true;
                    }

                } else {
                    formaTriangulo = false;
                }
            }
            if (formaTriangulo) {
                System.out.println("Os valores podem formar um triangulo!");
                System.out.println("É um triangulo " + tipoTriangulo);
            } else {

                System.out.println("Os valores não podem formar um triangulo!");
            }

            // se valido informe se Equilátero ou Isósceles ou Escaleno

        }
        entrada.close();
    }

}
