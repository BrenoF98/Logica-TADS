import java.util.Scanner;

public class Ex15NotasEBSI {

    /*
     * 15. Classificação de nota
     * 
     * Leia uma nota de 0 a 10 e classifique:
     * 
     * >= 9: Excelente;
     * >= 7: Bom;
     * >= 6: Suficiente;
     * < 6: Insuficiente.
     * 
     * Se a nota estiver fora do intervalo de 0 a 10, mostre uma mensagem de erro.
     * 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua nota: ");
        float nota = entrada.nextFloat();
        if (nota >= 0 && nota <= 10) {
            if (nota >= 9) {
                System.err.println("Excelente");
            } else if (nota >= 7) {
                
                System.err.println("Bom");

            } else if (nota >= 6) {
                
                System.err.println("Suficiente");
            }else {

                System.err.println("Insuficiente");
                
            }

        }else{
            System.out.println("Nota Invalida!");
        }

        entrada.close();
    }
}
