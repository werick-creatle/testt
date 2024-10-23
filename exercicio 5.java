// exercicio 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.err.println("Digite um número inteiro entre 1 e 7");
        exibirDiaSemana();
    }

    public static void exibirDiaSemana() {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        switch (n) {
            case 1:
                System.out.println("Domingo ");
                break;
            case 2:
                System.err.println("Segunda ");
                break;
            case 3:
                System.out.println("Terça ");
                break;
            case 4:
                System.err.println("Quarta ");
                break;
            case 5:
                System.err.println("Quinta ");
                break;
            case 6:
                System.out.println("Sexta ");
                break;
            case 7:
                System.out.println("Sabado ");
                break;
            default:
                System.err.println("Número digitado é invslido ");
                break;
        }
    }
}