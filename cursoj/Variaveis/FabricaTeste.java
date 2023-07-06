package Variaveis;

public class FabricaTeste {
    public static void main(String[] args) {
        
        Fabrica mark = new Fabrica();
        mark.fabricarCarro();
        mark.fabricarCarro();
        mark.fabricarCarro();
        mark.fabricarCarro();
        System.out.println("O funcionário Mark fabricou " + mark.carro);

        Fabrica lucio = new Fabrica(); 
        lucio.fabricarCarro();
        lucio.fabricarCarro();
        System.out.println("O funcionário Lucio " + lucio.carro);

        System.out.println("O total de carros fabricados foram " + Fabrica.totalDeCarros); 
    }
}
