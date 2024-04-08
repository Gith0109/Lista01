import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        // Informações
        int x;

        //Montagem
        Scanner resultado = new Scanner (System.in);
        System.out.println("Escolha um número");
        x = resultado.nextInt();

        //Imprimindo x
        System.out.printf("O conteudo de x seria: %d\n", x);
        //Ao quadrado
        System.out.printf("O quadrado de x seria: %d\n", (x * x ));
        // Resto da divisao
        System.out.printf("O resto da divisão por 3: %d\n", (3 % x));
        //A metade de x
        System.out.printf("A metade de x seria: %.2f\n", (float) x/2);
        // O resultado do produto de x pela metade de x
        System.out.printf("O produto de x pela metade de x seria: %.2f\n", (float) x * ((float)(x/2)));
    }
}
