

public class Simulado3 {
    public static void main(String[] args) {
        int c, d, u; // centena, dezena, unidade

        for (int i = 100; i <= 999 ; i++){

            c = i / 100;
            d = (i % 100) / 10;
            u = i % 10;

            //System.out.printf("%d%d%d\n",c,d,u);
            


            if (c - d == -1 && d - u == -1 ){

                System.out.println("Crescente: " +  i);
            }
            if (c - d == 1 && d - u == 1) {
                System.out.println("Decrescente: " +  i);
            }
            
            
        }
    }
}
