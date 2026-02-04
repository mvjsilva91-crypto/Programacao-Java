import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner calScanner = new Scanner(System.in);
        int dim; 
        float val = 0;

        System.out.println("------------------------------");
        System.out.println("       CRIANÇA ESPERANÇA      ");
        System.out.println("   Muito obrigado por Ajudar  ");
        System.out.println("------------------------------");
        System.out.println("      [1] para doar R$10      ");
        System.out.println("      [2] para doar R$25      ");
        System.out.println("      [3] para doar R$50      ");
        System.out.println("      [4] para doar outros valores ");
        System.out.println("      [5] para Cancelar!      ");

        dim = calScanner.nextInt(); // <- aqui

        switch (dim) {
            case 1:
                val = 10;
                break;
            case 2:
                val = 25;
                break;
            case 3:
                val = 50;
                break;
            case 4:
                System.out.print("Digite o valor que deseja doar: ");
                val = calScanner.nextFloat(); // <- aqui
                break;
            case 5:
                System.out.println("Agradecemos mesmo Assim!!!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        if (dim != 5) {
            System.out.println("------------------------------");
            System.out.println("Sua doação foi de R$: " + val);
            System.out.println("Muito Obrigado pela participação!!!");
            System.out.println("------------------------------");
        }

        calScanner.close();
    }
}

