public class OperadoresLogicos {

    public static void main(String [] args){

        int a,b;

        a = 17;
        b = 4;

        int soma = a + b;
        int subt = a - b;
        int mult = a * b;
        int divi = a / b;
        int rest = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subt);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + divi);
        System.out.println("Resto: " + rest);

        /* 
        
        && E
        || ou 
        != DIFERENTE
        == IGUAL
        >= Maior ou igual
        > maior
        <= Menor ou igual
        < menor

        */

        boolean resultado;

        a = 5;
        b = 3;

        resultado = a > b;

        System.out.println("Resultado A > B: " + resultado);

        resultado = a == b;

        System.out.println("Resultado A == B: " + resultado);

        resultado = a != b;

        System.out.println("Resultado A != B: " + resultado);


    }
    
}
