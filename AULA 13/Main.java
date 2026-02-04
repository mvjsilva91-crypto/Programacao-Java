import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;

        System.out.println("Escolha o time de Futebol: ");
        System.out.println("1 - São Paulo, Santos, Palmeiras, Bragantino");
        System.out.println("2 - Flamengo, Fluminense, Botafogo, Vasco");
        System.out.println("3 - Internacional, Grêmio, Juventude");

        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("É um Time Paulista!");
                break;
            case 2:
                System.out.println("É um Time Carioca!");
                break;
            case 3:
                System.out.println("É um Time Gaúcho!");
                break;
            default:
                System.out.println("É de outro Estado!");
        }

        sc.close(); 
    }
}

