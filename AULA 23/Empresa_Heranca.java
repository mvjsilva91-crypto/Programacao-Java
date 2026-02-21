public class Empresa_Heranca {
    public static void main(String[] args) {
        // Criando um objeto Gerente
        Gerente gerente = new Gerente("Ana Silva", 7500.0, "Financeiro");

        // Criando um objeto Desenvolvedor
        Desenvolvedor dev = new Desenvolvedor("João Costa", 5000.0, "Java");

        System.out.println("--- Dados do Gerente ---");
        System.out.println("Nome: " + gerente.getNome()); // Metodo herdado de Funcionario
        gerente.trabalhar();                               // Metodo herdado de Funcionario
        gerente.aprovarVerba();                            // Metodo especifico de Gerente

        System.out.println("\n--- Dados do Desenvolvedor ---");
        System.out.println("Nome: " + dev.getNome());      // Metodo herdado de Funcionario
        dev.trabalhar();                                   // Metodo herdado de Funcionario
        dev.programar();                                   // Metodo especifico de Desenvolvedor
    }
}
