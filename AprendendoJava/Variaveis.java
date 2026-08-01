public class Variaveis {
    public static void main(String[] args) {
        char gostadecafe = 's';

        if (gostadecafe == 's'){
            System.out.println("Eu gosto de café");
        } else {
            System.out.println("Eu não gosto de café");
        }
        String nome1 = "Breno";
        String nome2 = "Breno";
        String nome3 = new String("Breno");

//      Forma Errada
//
//        if (nome1 == nome2){
//            System.out.println("nome1 é igual a nome2");
//        } else {
//            System.out.println("nome1 não é igual a nome2");
//        }
//        if (nome1 == nome3){
//            System.out.println("nome1 é igual a nome3");
//      } else {
//        System.out.println("nome1 não é igual a nome3");
//    }
//

        if (nome1.equals(nome2)){
            System.out.println("nome1 é igual a nome2");
        } else {
            System.out.println("nome1 não é igual a nome2");
        }
        if (nome1.equals(nome3)){
            System.out.println("nome1 é igual a nome3");
        } else {
            System.out.println("nome1 não é igual a nome3");
        }

    }
}
