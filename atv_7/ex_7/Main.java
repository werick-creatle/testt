package atv_7.ex_7;

// exercicio 7:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calcularFatorial();
    }

    public static void calcularFatorial() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número para saber o fatorial: ");
        int num = ler.nextInt();
        int fat = 1;

        for (int i = 1; i <= num; i++) {
            fat = fat * i;
        }
        System.out.println("O resultado do fatoria de " + num + " é: " + fat);
    }
}