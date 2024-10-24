package atv_7.ex_4;

// exercício 4:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        isPar();
    }

    public static void isPar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("digite um número inteiro para saber se é par ou impar ");
        int num = ler.nextInt();

        while (num != 0) {

            if (num % 2 == 0) {
                System.out.println("O número " + num + " é par ");
            } else {
                System.out.println("O número " + num + " é ímpar");
            }
            System.out.println("Digite digite outro número (ou 0 para finalizar)");
            num = ler.nextInt();
        }
        System.out.println("você finalizou o progama");
    }
}