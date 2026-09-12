

public class Fibonacci {
    public static void main(String[] args) {

        int fibonacci = 1, anterior = 1;

        
        for (int i = 1; i <= 10; i++) {

                
                System.out.print(fibonacci + " ");
                
                anterior = fibonacci - anterior;
                fibonacci = anterior + fibonacci;

        }
    }
}
