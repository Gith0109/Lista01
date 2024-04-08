import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {

        //Informações
        float FahrenhitPraCelsius, f1;

        //Montagem
        Scanner fahrenheit = new Scanner(System.in);
        System.out.println("Fahrenheit para Graus Celsius");
        f1 = fahrenheit.nextFloat();

        //Calculo
        FahrenhitPraCelsius = (float) ((f1 - 32)/1.8);
        System.out.printf("São %.1f\n Graus Celsius", FahrenhitPraCelsius);
    }
}

