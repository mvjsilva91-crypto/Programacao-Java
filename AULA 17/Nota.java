import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();

            // Verifica se a nota está fora do intervalo
            if (nota < 0 || nota > 10) {
                System.out.println("Valor Incorreto!!!");
            }

        } while (nota < 0 || nota > 10); // Repete enquanto a nota for inválida

        System.out.println("Correto! Nota válida: " + nota);
    }
}
