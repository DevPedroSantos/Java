public class Elevador {

    // Atributos
    private int Capacidade_maxima;
    private String Andares_atendidos;
    private int Peso_Maximo;
    private int capacidade_atual;
    private String Andar_atual;
    private String Andar_pedido;
    private int numero_elevador;

    // construtor
    public Elevador(int numero_elevador, int Capacidade_maxima, String Andares_atendidos,int Peso_Maximo,String Andar_atual, String Andar_pedido, int capacidade_atual){
        this.numero_elevador = numero_elevador;
        this.Andar_pedido = Andar_pedido;
        this.Andar_atual = Andar_atual;
        this.Andares_atendidos = Andares_atendidos;
        this.Capacidade_maxima = Capacidade_maxima;
        this.Peso_Maximo = Peso_Maximo;
        this.capacidade_atual = 0;
    }

    // métodos
    public void Mais_Pessoas (int incremento) {
        this.capacidade_atual += incremento;
    }

    public void Menos_Pessoas (int incremento) {
        this.capacidade_atual -= incremento;}

    public void imprimirDados(){
        System.out.println("Número do elevador: " + this.numero_elevador);
        System.out.println("Seu andar atual: " + this.Andar_atual);
        System.out.println("Andares atendidos: " + this.Andares_atendidos);
        System.out.println("Andar pedido: " + this.Andar_pedido);
        System.out.println("Número de pessoas: " + this.capacidade_atual);
        System.out.println("Capacidade máxima: " + this.Capacidade_maxima);
        System.out.println("Peso máximo: " + this.Peso_Maximo);
    }
}