import java.util.Scanner;

public class Loja {

    // Função que conta quantas frutas estão com estoque baixo
    public static int contarEstoqueBaixo(int[] quantidades) {
        int contador = 0;

        for (int i = 0; i < quantidades.length; i++) {
            if (quantidades[i] < 10) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] frutas = new String[3];
        int[] quantidades = new int[3];

        // Entrada de dados
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome da fruta " + (i + 1) + ": ");
            frutas[i] = sc.nextLine();

            System.out.print("Digite a quantidade em estoque: ");
            quantidades[i] = sc.nextInt();
            sc.nextLine(); // limpa o buffer
        }

        System.out.println("Frutas com estoque baixo:");

        // Verificação e saída
        for (int i = 0; i < 3; i++) {
            if (quantidades[i] < 10) {
                System.out.println(frutas[i] + " - Quantidade: " + quantidades[i]);
            }
        }

        // Chamada da função
        int totalBaixo = contarEstoqueBaixo(quantidades);

        System.out.println("\nTotal de frutas com estoque baixo: " + totalBaixo);

        sc.close();
    }
}

