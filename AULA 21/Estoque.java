import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Fruta> frutas;


    public Estoque() {
        frutas = new ArrayList<>();
}

    public void adicionarFruta(Fruta fruta) {
        frutas.add(fruta);
}

    public int contarEstoqueBaixo() {
        int contador = 0;
        for (Fruta fruta: frutas) {
            if(fruta.isEstoqueBaixo()) {
            contador++;
        }
    }
    return contador;
}


    public void gerarRelatorio() {
        System.out.println("*\n ----- Gerar Relatório ----- *");
        for(Fruta fruta: frutas) {
            if(fruta.isEstoqueBaixo()) {
             System.out.println("* ALERTA!: A Fruta '" + fruta.getNome() + "' está com Estoque abaixo! Apenas" + fruta.getQuantidade() + "Unidade.");

            }
        }
    System.out.println("Total de Frutas com Estoque baixo: " + contarEstoqueBaixo());

    }

}



