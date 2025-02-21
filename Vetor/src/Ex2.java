import java.util.Arrays;

public class Ex2 {

    // Cria 2 vetores com os valores
    static int[] vetor1 = {2,6,7,8,9};
    static int[] vetor2 = {0,1,3,4,5};

    // Cria um terceiro vetor para concatenar os valores
    static int[] vetor3 = new int[10];

    // Cria os indices do vetor 1 e 2
    static int i1,i2 = 0;

    // Método principal para a execução do programa
    public static void main(String[] args) {

        // Criado o index do vetor 3 e criado um looping para preencher os 10 espaços do vetor
            for (int i3 = 0; i3 < 10; i3++) {

                    // Se todos os numeros do vetor 2 já foram colocados
                    // Vai inserir todos os numeros do vetor 1
                    if (i2 >= 5) {
                        vetor3[i3] = vetor1[i1];
                        i1++;
                        continue;
                    }

                    // Se todos os numeros do vetor 1 já foram colocados
                    // Vai inserir todos os numeros do vetor 2
                    if (i1 >= 5) {
                        vetor3[i3] = vetor2[i2];
                        i2++;
                        continue;
                    }

                    // Verifica qual valor do vetor é maior
                    if (vetor1[i1] < vetor2[i2] && i1 < 5){
                        vetor3[i3] = vetor1[i1];
                        i1++;
                    }
                    else{
                        vetor3[i3] = vetor2[i2];
                        i2++;
                    }

            }

            System.out.println("Vetor 3: " + Arrays.toString(vetor3));

    }

}