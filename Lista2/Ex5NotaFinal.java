import java.util.Scanner;

public class Ex5NotaFinal {

    /* 5. Nota suficiente

Leia a nota final de um aluno. 
Informe APROVADO quando a nota for maior ou igual a 6.0 e REPROVADO caso contrário.
 */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float notaFinal;

        System.out.print("Digite a nota final de um aluno: ");

        notaFinal = entrada.nextFloat();

        if (notaFinal >= 6){
            
            System.out.println("APROVADO");
        }else {
            System.out.println("REPROVADO");
        }

        entrada.close();
        
    }
}
