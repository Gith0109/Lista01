import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {

        //informações
        float polegadas, milimetros;

        //Montagem
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantas polegas:");
        polegadas = leitor.nextFloat();

        //Informações
        milimetros = (float) (polegadas * 25.4);

        //Calculo
        System.out.printf("É %.2f\n milimetros", milimetros);
    }
}
