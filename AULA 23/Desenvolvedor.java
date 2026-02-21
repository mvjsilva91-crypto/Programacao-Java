// Desenvolvedor também herda de Funcionario_Empresa 
public class Desenvolvedor {

    // Atributo especifico de um Desenvolvedor
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem){

    // Chamando o Construtor da Super Classe Funcionario_Empresa 
    super(nome, salario);
    this.linguagem = linguagem;
    }

    // Método especifico de um Desenvolvedor 
    public void programar() {
        System.out.println("O dev " + this.nome + " está programando em " + this.linguagem + ".")
    }
}
