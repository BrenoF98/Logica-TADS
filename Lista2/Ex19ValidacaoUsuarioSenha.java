import java.util.Scanner;

public class Ex19ValidacaoUsuarioSenha {
    public static void main(String[] args) {
        /*
         * 19. Validação de usuário e senha
         * Leia um nome de usuário e uma senha.
         * 
         * usuário correto: "admin";
         * senha correta: "java123".
         * O programa deve informar separadamente se o usuário está incorreto ou se a
         * senha está incorreta. O acesso só deve ser permitido quando os dois estiverem
         * corretos.
         */

        Scanner entrada = new Scanner(System.in);

        String usuario, senha;

        System.out.println("Usuario: ");

        usuario = entrada.nextLine();
        if (usuario.equals("admin")) {
            System.out.println("Senha: ");
            senha = entrada.nextLine();
            if (senha.equals("java123")) {

                System.out.println("Acesso permitido!");

            } else {
                System.out.println("Senha incorreta!");
            }

        } else {
            System.out.println("Usuario não registrado!");
        }

        entrada.close();

    }
}
