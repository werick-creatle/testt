package atv_7.ex_8;
// atividade 8 exercicio 1:
public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.cor = "Azul";
        carro.marca = "honda";
        carro.veloMaxima = 200;
        carro.modelo = "civic";

        System.out.println("Cor do carro: "+carro.cor);
        System.out.println("Marca do carro: "+ carro.marca);
        System.out.println("Velocidade maxima do carro: "+carro.veloMaxima+"Kmh");
        System.out.println("Marca do carro: "+carro.modelo);
    }
}
