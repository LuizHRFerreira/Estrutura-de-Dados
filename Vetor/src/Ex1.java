import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    static int[] vetor = {1, 2, 6, 8, 9};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int X = scanner.nextInt();
        scanner.close();

        int[] resul = new int[6];
        int i = 0, j = 0;


        while (i < vetor.length && vetor[i] < X) {
            resul[j++] = vetor[i++];
        }


        resul[j++] = X;


        while (i < vetor.length) {
            resul[j++] = vetor[i++];
        }

        System.out.println("Novo vetor ordenado: " + Arrays.toString(resul));
    }
}
