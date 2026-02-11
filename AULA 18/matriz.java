import java.util.Scanner

public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m , n;
        System.out.print("Qual a quantidade de Linhas de matriz");
        m = sc.nextInt();
        System.out.print("Qual a quantidade de Colunas de matriz");
        n = sc.nextInt();

        int[][] matriz = new int [n][m];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ",i,j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    
}
