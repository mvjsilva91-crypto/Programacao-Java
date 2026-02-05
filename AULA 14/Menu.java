import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menu;

        do {
            menu = exibirMenu(s);

            switch (menu) {
                case 1:
                    System.out.println("Stranger Things: Uma mistura empolgante de suspense, nostalgia e mistério sobrenatural.");
                    break;

                case 2:
                    System.out.println("Yu Yu Hakusho: Melhor dos melhores animes.");
                    break;

                case 3:
                    System.out.println("O Incrível Mundo de Gumball: Quer rir, assista!");
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (menu != 0);

        s.close();
    }

    public static int exibirMenu(Scanner scanner) {
        System.out.println("\n===== ESTFLIX =====");
        System.out.println("1. Stranger Things");
        System.out.println("2. Yu Yu Hakusho");
        System.out.println("3. O Incrível Mundo de Gumball");
        System.out.println("0. Sair do Programa");
        System.out.print("Escolha uma opção (1 a 3 ou 0 para finalizar): ");
        return scanner.nextInt();
    }
}

