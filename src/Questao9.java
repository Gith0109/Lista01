import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        //Informações
        float homem, h = 650, mulher, m = 420, crianca, c = 290, calculo;

        //Montagem
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos homens tem no churrasco?");
        homem = leitor.nextFloat();

        System.out.println("Quantas mulheres tem no churrasco?");
        mulher = leitor.nextFloat();

        System.out.println("Quantas crianca tem no churrasco?");
        crianca = leitor.nextFloat();

        //Informações
        calculo = ((homem * h) + (mulher * m) + (crianca * c))/1000;

        //Calculo
        System.out.printf("Total de quilogramas %.2f\n", calculo);


    }
}
