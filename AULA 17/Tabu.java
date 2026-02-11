import java.util.Scanner;

public class Tabu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, x;
        String resposta;

        System.out.println("|========== Sistemas de TABUADA Senai Anchieta ==========|");
        System.out.println("|==== Vamos aprender de uma vez por todas a TABUADA??? ====|");
        do {
            System.out.print("Digite um número para saber a tabuada: ");
            i = sc.nextInt();
            System.out.println("\nVocê está vendo a tabuada do " + i + "!!!\n");
            for (x = 1; x <= 10; x++) {
                System.out.println(i + " x " + x + " = " + (i * x));
            }
            System.out.print("\nDeseja saber outra tabuada [S/N]? ");
            resposta = sc.next();
        } while (!resposta.equals("n"));
        System.out.println("|========== Espero que tenha aprendido a tabuada!!! ==========|");
        System.out.println("|============= Sistemas de TABUADA Senai Anchieta ============|");
    }
}
