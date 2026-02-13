import java.util.Scanner;

public class Func {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nome1, nome2;
    double valorPorHora1, valorPorHora2, total;
    int horas1, horas2;

    System.out.println("Dados do Primeiro Funcionário: \n");
    System.out.println("O nome do Funcionário: \n");
    nome1 = sc.next();
    System.out.println("Valor recebido por Hora: \n");
    valorPorHora1 = sc.nextDouble();
    System.out.println("Quantidade de Horas Trabalhadas: \n");
    horas1 = sc.nextInt();

    System.out.println("Dados do Segundo Funcionário: \n");
    System.out.println("O nome do Funcionário: \n");
    nome2 = sc.next();
    System.out.println("Valor recebido por Hora: \n");
    valorPorHora2 = sc.nextDouble();
    System.out.println("Quantidade de Horas Trabalhadas: \n");
    horas2 = sc.nextInt();

    total = valorPorHora1 * horas1 + valorPorHora2 * horas2;

    System.out.printf(  "O total do valor com as horas dos Funcionários "+ nome1 + " e "+ nome2 + " foi de " + "%.2f%n", total);

    sc.close();
   }

}

