package Matematica;

//import static java.lang.Math.sqrt;
// Neste exemplo eu importo apenas o atibuto que eu quero, já com os "*" eu importo todos.
import static java.lang.Math.*;
import static java.lang.System.*;

public class Matematica {

    static double raiz = 81;

    static void calculaRaiz(){
        out.println(sqrt(raiz));
    }

    static void exibeValorDePI(){
        out.println(PI);
    }

    public static void main(String[] args) {
        calculaRaiz();
        exibeValorDePI();
    }
}

//Ao deixar minhas variaveis e meus metodos estaticos, não preciso criar um objeto 
