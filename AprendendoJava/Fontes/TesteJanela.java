import javax.swing.JOptionPane; // importa a classe JOptionPane, que é usada para criar janelas de diálogo

public class TesteJanela { // cria a classe TesteJanela
    public static void main(String[] args) { // cria o método main, que é o ponto de entrada do programa

        String userLanguage = System.getProperty("user.language"); // serve para obter a linguagem do usuário

        JOptionPane.showMessageDialog( // serve para exibir uma janela de mensagem

                null, // serve para centralizar a janela

                "Linguagem do Usuário: " + userLanguage, // serve para exibir a linguagem do usuário

                "Linguagem do Usuário", // serve para exibir o título da janela

                JOptionPane.CANCEL_OPTION // serve para exibir o ícone de cancelamento na janela
        );
    }
}
