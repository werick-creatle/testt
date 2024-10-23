// exercicio 6:
public class Main {
    public static void main(String[] args) {
        maiorValor();
        menorNumero();
        somaDivisao();
    }

    public static void maiorValor() {
        int[] vetor = { 2, 4, 6, 8 };
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }
        System.out.println("O maior número é: " + maior);
    }

    public static void menorNumero() {
        int[] vetor = { 2, 4, 6, 8 };
        int menor = 0;
        for (int i = 0; i > vetor.length; i++) {
            if (menor > vetor[i]) {
                menor = vetor[i];
            }
        }
        System.out.println("O menor número é: " + menor);
    }

    public static void somaDivisao() {
        int[] vetor = { 2, 4, 6, 8 };
        int res = (vetor[0] + vetor[3]) / 2;
        System.out.println("resultado da soma e depois divisao é: " + res);
    }
}
