package Funcionario;

public class Funcionario {
    String nome;
    int idade;
    int cpf;

    public Funcionario(){
        this.nome = "Mark";
        this.idade = 28;
        this.cpf = 123456;
    }

    public Funcionario(String NovoNome, int NovaIdade, int NovoCpf){
        this.nome = NovoNome;
        this.idade = NovaIdade;
        this.cpf = NovoCpf;
    }

    Funcionario(String NovoNome){
        this.nome = NovoNome;
        this.idade = 24;
        this.cpf = 123123;
    }

    Funcionario(int NovaIdade){
        this.idade = NovaIdade;
    }
}
