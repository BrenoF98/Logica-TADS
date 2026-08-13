import java.util.Scanner;

public class Exemploaula3{
    public static void main(String[] args) {

        System.out.println("FUNCIONA!"); // -> Instrução

        System.out.print("Escreva um número: "); // -> Instrução
        Scanner scanner = new Scanner(System.in);        

        /*
        
        scanner => nome da variavel
        new Scanner();  => nova instancia 
        
        */
    // VARIAVEL    

    // toda variaivel tem um tipo e um nome => Isso é declarar a variavel. 

    
    int numero; // -> Espaço na memoria capaz de guardar um numero inteiro. 
    // qual o nome? nuemro. 
    // Qual o tamanhã 4 byte {-2.5b até 2.5b}.
    
    String html; 
    String nome;
    String a; // Evitar colocar variaveis sem nome ligado ao proposito. 
    
    // Há duas operações com variaveis. 

    // atribuir -> nome da variavel = valor a ser a tribuido. 

    // Avaliação -> 
    numero = scanner.nextInt();
    System.out.println("O numero é" + numero);

    int dobro;
    dobro = numero * 2;
    System.out.println(dobro);
    System.out.println("O dobra do numero é: " + dobro);

    // concatenação 

    System.out.println();

    
    scanner.close();
    }
}

