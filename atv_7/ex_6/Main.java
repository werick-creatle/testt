package atv_7.ex_6;

// exercico 6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        int tamanho = ler.nextInt();
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Dite o valor da posição " + i + " do vetor");
            vetor[i] = ler.nextInt();
        }
        int maior = maiorNumero(vetor);
        System.out.println("O maior número é: " + maior);
        int menor = menorNumero(vetor);
        System.out.println("O menor número é: " + menor);
        double media = calculoMedia(vetor);
        System.out.println("resultado da média do maior número e o menor número é: " + media);
    }

    public static int maiorNumero(int[] vetor) {
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int menorNumero(int[] vetor) {
        int menor = vetor[0];
        // 4

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] < menor) {
                // 0 < 4
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static double calculoMedia(int[] vetor) {
        double media = (maiorNumero(vetor) + menorNumero(vetor)) / 2.0;
        return media;
    }
}