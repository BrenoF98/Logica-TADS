import java.util.Scanner;

public class Exerc17 {

    /* 17. Área total de uma sala
            Uma sala retangular possui uma porta, também retangular. Solicite ao usuário:

            a largura da parede;
            a altura da parede;
            a largura da porta;
            a altura da porta.
            Calcule e mostre a área da parede que poderá ser pintada, desconsiderando a área ocupada pela porta.

 */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double larguraParede, alturaParede, LarguraPorta, alturaPorta, areaParede;

        System.out.print("Digite a largura total da parede em metro: ");
        larguraParede = scanner.nextDouble();
        System.out.print("Digite a altura total da parede em metro: ");
        alturaParede = scanner.nextDouble();
        System.out.print("Digite a largura total da porta em metro: ");
        LarguraPorta = scanner.nextDouble();
        System.out.print("Digite a altura total da porta em metro: ");
        alturaPorta = scanner.nextDouble();


        areaParede = (alturaParede * larguraParede) - (alturaPorta * LarguraPorta);
        
        System.out.print("A área a ser pintada é : " + areaParede + " m");
        
        scanner.close();

    }


}
