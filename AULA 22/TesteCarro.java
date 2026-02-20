public class TesteCarro {
    public static void main(String[] args) {
        System.out.println("--- Criando e Interagindo com o meu Fusca ---");
        // Criamos uma instancia(um objeto real) da classe Carro
        Carro meuFusca = new Carro();

        // Tentando acelerar com o carro desligado
        System.out.println("\n Tentando acelerar o carro...");
        meuFusca.acelerar(20); /*A regra de encapsulamento vai impedir */
        System.out.println("Velocidade atual do fusca: " + meuFusca.getVelocidade() + "Km/h");

        // Ligamos o carro usando o método público
        System.out.println("\n Agora vamos ligar o carro...");
        meuFusca.ligar();
        
        // Tentamos ligar o carro de Novo
        meuFusca.ligar();

        // Agora aceleramos
        System.out.println("\n Acelerando...");
        meuFusca.acelerar(15); /*aumenta para 15. amarchar vai para 1 */
        meuFusca.acelerar(20); /*Aumenta para 35. a marchar vai para 2 */

        // Vamos frear
        System.out.println("\n Freando um pouco...");
        meuFusca.frear(10); /*Reduz para 25. a marchar volta para 2. */
        
        System.out.println("Velocidade final do fusca: " + meuFusca.getVelocidade() + " Km/h");
    }
    
}
