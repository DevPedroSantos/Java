public class ElevadorTeste {
    public static void main(String [] args){
        // entrando no elevador

        Elevador atrio = new Elevador(3, 24,"5, 3, 2, 1, T, SS",1800,"T",
        "3",5);
        atrio.Mais_Pessoas(10);
        atrio.imprimirDados();
    }
}
   