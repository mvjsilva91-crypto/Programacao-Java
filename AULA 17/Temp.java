import java.util.Scanner;



public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();

            double f = (c * 9 / 5) + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);

            System.out.print("Deseja repetir [s/n]? ");
            resp = sc.next().charAt(0);

        } while (resp != 'n');

        sc.close();
    }
}

