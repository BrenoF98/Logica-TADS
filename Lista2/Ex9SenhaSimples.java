import java.util.Scanner;

public class Ex9SenhaSimples {

    /* 9. Senha simples
Leia uma senha inteira. 
Se a senha digitada for 4321, mostre "Acesso permitido". 
Caso contrário, mostre "Senha incorreta". */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int senha = 4321, senhadigitada;

        System.out.print("Digita sua senha: ");
        senhadigitada = entrada.nextInt();

        if (senha == senhadigitada) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Senha incorreta");
        }

        entrada.close();
        
    }
    
}
