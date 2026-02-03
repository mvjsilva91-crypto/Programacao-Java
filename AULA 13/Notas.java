import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a Primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a Segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a Terceira nota: ");
        double n3 = sc.nextDouble();

        System.out.print("Digite a Quarta nota");
        double n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média é: " + media);

        sc.close();
    }
}

