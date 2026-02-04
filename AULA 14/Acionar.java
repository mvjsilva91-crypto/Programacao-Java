import java.util.Scanner;

public class Acionar {
    public static void main(String[] args) {
        Scanner acn = new Scanner(System.in);
        int btncor;
        String btn;

        System.out.println("Ligue o Equipamento [ON]");
        btn = acn.next();

        System.out.println("Escolha a Lampada que deseja Ligar");
        System.out.println("[1] Lâmpada Azul");
        System.out.println("[2] Lâmpada Verde");
        System.out.println("[3] Lâmpada Amarela");
        System.out.println("[4] Lâmpada Vermelha");

        btncor = acn.nextInt();

        switch (btncor) {
            case 1:
                System.out.println("Lâmpada Azul Ligada!");
                break;
            case 2:
                System.out.println("Lâmpada Verde Ligada!");
                break;
            case 3:
                System.out.println("Lâmpada Amarela Ligada!");
                break;
            case 4:
                System.out.println("Lâmpada Vermelha Ligada!");
                break;
            case 5:
                System.out.println("Botão de Emergência Ligado!");
                break;
            default:
                System.out.println("Opção Invalida!");
        }

        System.out.println("Desligue o Equipamento [OFF]");
        btn = acn.next();

        if (btn.equalsIgnoreCase("OFF")) {
            System.out.println("Equipamento desligado com Sucesso!!");
        } else {
            System.out.println("Opção Invalida!");
        }

        acn.close();
    }
}
