
public class Gerenciador {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        EntraDados entrada = new EntraDados();

        System.out.println("----- Gerenciador de Frutas -----");

        int totalFrutas = 3;
        for (int i = 0; i < totalFrutas; i++ ) {
            Fruta fruta = entrada.lerFrutas();
            estoque.adicionarFruta(fruta);
        }

        estoque.gerarRelatorio();
        entrada.fecharScanner();

    }
    
}
