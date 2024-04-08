import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        //Informações
        int horas, minutos, segundos, calculo;

        //Montagem
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a hora");
        horas= leitor.nextInt();

        System.out.println("Digite os minutos");
        minutos= leitor.nextInt();

        System.out.println("Digite os segundos");
        segundos= leitor.nextInt();

        //Informações
        calculo = (horas*60*60)+(minutos*60)+segundos;

        //Calculo
        System.out.printf("Seu dia tem o total de %d\n segundos", calculo);


    }
}
