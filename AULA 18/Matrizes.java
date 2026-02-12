import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m, n;

        System.out.print("Qual a quantidade de Linhas da matriz: ");
        m = sc.nextInt();

        System.out.print("Qual a quantidade de Colunas da matriz: ");
        n = sc.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m][n];

    
        System.out.println("Digite os valores da matriz A:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("Elemento A[%d,%d]: ", i, j);
                a[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("Digite os valores da matriz B:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("Elemento B[%d,%d]: ", i, j);
                b[i][j] = sc.nextInt();
            }
        }

       
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

     
        System.out.println("Matriz Soma (C):");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("%d", c[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
