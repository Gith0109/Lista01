import java.util.Scanner;
import java.util.zip.GZIPInputStream;

public class Questao1 {

    public static void main(String[] args) {

        // Informações/Strings

        int n1, n2, resultado;

        //Imprimindo e Armanezando dados
        Scanner total = new Scanner(System.in);
        System.out.println("Calcular");
        n1 = total.nextInt();

        System.out.println("Calcular");
        n2 = total.nextInt();

        //Formula da soma de Strings e Resultado
        resultado = n1 + n2 ;

        System.out.printf("Resultado: %d.", resultado);
    }
}
