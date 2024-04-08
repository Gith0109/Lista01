import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        //Informações
        float raio, pi;
        pi = (float) 3.1415926;

        //Montagem
        Scanner circulo = new Scanner(System.in);
        System.out.println("Qual o raio do seu círculo?");
        raio = circulo.nextFloat();

        //Informações
        float CalculodaArea ;
        CalculodaArea = pi*(raio * raio);

        //Calculo
        System.out.printf("Área do círculo é: %.3f\n", CalculodaArea);


    }
}
