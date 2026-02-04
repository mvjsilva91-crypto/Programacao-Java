import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner calScanner = new Scanner(System.in);
        int n1, n2, op, res = 0;

        System.out.print("Digite o Primeiro Número: ");
        n1 = calScanner.nextInt();

        System.out.print("Digite o Segundo Número: ");
        n2 = calScanner.nextInt();

        System.out.print("Escolha a Operação: 1 = +, 2 = -, 3 = *, 4 = / : ");
        op = calScanner.nextInt();

        switch (op) {
            case 1:
                res = n1 + n2;
                break;
            case 2:
                res = n1 - n2;
                break;
            case 3:
                res = n1 * n2;
                break;
            case 4:
                res = n1 / n2;
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("O resultado da Operação é: " + res + "!!!");    

        calScanner.close();
    }
}

        
      