// A palavra "extends" estabelece que Gerente é um Funcionário
// Gerente Herda nome, salário e o metodo trabalhar() de Funcionario_Empresa
public class Gerente_Empresa extends Funcionario_Empresa {
    
    // Atributo especifico de um Gerente
    private String departamento;
    
    // Construtor da classe filha 
    public Gerente(String nome, double salario, String departamento) {
        // A palavra "super" chama o construtor da classe mãe (Funcionario_Empresa)
        // É obrigatório para inicializar os atributos que foram herdados (nome e salario) 
        super(nome, salario);
        this.departamento = departamento;
    }

    // Método especifico de um Gerente 
    public void aprovarVerba() {
        System.out.println("O gerente " + this.nome + " do depto " + this.departamento + " aprovou a verba");
    }
}
