import javax.swing.JOptionPane;

public class JogoDaForcaIA {

    public static void main(String[] args) {

        String palavra = JOptionPane.showInputDialog(
                null, "Informe a palavra:", "Jogo da Forca", JOptionPane.QUESTION_MESSAGE);

        // Cancelou ou deixou em branco
        if (palavra == null || palavra.isBlank()) {
            return;
        }

        palavra = palavra.trim();
        int numChar = palavra.length();

        String[] forca = new String[numChar];
        String[] recebeForca = new String[numChar];

        for (int i = 0; i < numChar; i++) {
            forca[i] = String.valueOf(palavra.charAt(i));
            recebeForca[i] = "_";
        }

        final int MAX_ERROS = 5;
        int erros = 0;
        boolean ganhou = false;

        do {
            String chute = JOptionPane.showInputDialog(
                    null,
                    montaTela(recebeForca) + "\n\nErros: " + erros + " de " + MAX_ERROS
                            + "\nChute uma letra (ou digite \"sair\"):",
                    "Jogo da Forca",
                    JOptionPane.QUESTION_MESSAGE);

            if (chute == null || chute.equalsIgnoreCase("sair")) {
                break;
            }

            chute = chute.trim();

            if (chute.length() != 1) {
                JOptionPane.showMessageDialog(
                        null, "Digite apenas uma letra.", "Atenção", JOptionPane.WARNING_MESSAGE);
                continue;
            }

            boolean acertou = false;

            for (int j = 0; j < numChar; j++) {
                if (forca[j].equalsIgnoreCase(chute)) {
                    recebeForca[j] = forca[j];
                    acertou = true;
                }
            }

            if (!acertou) {
                erros++;
            }

            ganhou = true;
            for (String letra : recebeForca) {
                if (letra.equals("_")) {
                    ganhou = false;
                    break;
                }
            }

        } while (!ganhou && erros < MAX_ERROS);

        if (ganhou) {
            JOptionPane.showMessageDialog(
                    null, montaTela(recebeForca) + "\n\nParabéns, você acertou!",
                    "Fim de jogo", JOptionPane.INFORMATION_MESSAGE);
        } else if (erros >= MAX_ERROS) {
            JOptionPane.showMessageDialog(
                    null, "Você perdeu! A palavra era: " + palavra,
                    "Fim de jogo", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Monta a exibição da palavra, ex.: | a | _ | c |
    private static String montaTela(String[] letras) {
        return "| " + String.join(" | ", letras) + " |";
    }
}