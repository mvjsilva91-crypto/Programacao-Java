import java.util.Scanner;

public class Matrizz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m, n;

        System.out.print("Qual a quantidade de Linhas da matriz: ");
        m = sc.nextInt();

        System.out.print("Qual a quantidade de Colunas da matriz: ");
        n = sc.nextInt();

        int [][] numeros = new int[m][n];

        // Leitura da matriz
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                numeros[i][j] = sc.nextInt();
            }
        }

        // Impressão da matriz
        System.out.println("\nMatriz digitada:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}



            


