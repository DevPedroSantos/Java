package Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario mark = new Funcionario();
        System.out.println(mark.nome);
        System.out.println(mark.idade);
        System.out.println(mark.cpf);

        Funcionario murilo = new Funcionario("Murilo", 23, 654321);
        System.out.println(murilo.nome);
        System.out.println(murilo.idade);
        System.out.println(murilo.cpf);

        Funcionario thais = new Funcionario("Thais");
        System.out.println(thais.nome);
        System.out.println(thais.idade);
        System.out.println(thais.cpf);

        Funcionario julio = new Funcionario(25);
        julio.nome = "Julio";
        julio.cpf = 321321;
        System.out.println(julio.nome);
        System.out.println(julio.idade);
        System.out.println(julio.cpf);
    }
}
