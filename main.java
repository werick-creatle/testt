import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[5]; 

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma nota: ");
            notas[i] = ler.nextDouble(); 
        }
        
        System.out.println("Notas armazenadas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]); 
        }
        
        ler.close(); 
    }
}