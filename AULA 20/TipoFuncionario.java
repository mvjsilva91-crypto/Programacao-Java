import java.util.Scanner;

public class TipoFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f1, f2;

        f1 = new Funcionario();
        f2 = new Funcionario();

        System.out.println("Dados do Primeiro Funcionário: ");
        f1.nome = sc.next();
        f1.valorPorHora = sc.nextDouble();
        f1.horas = sc.nextInt();

        System.out.println("Dados do Segundo Funcionário: ");
        f2.nome = sc.next();
        f2.valorPorHora = sc.nextDouble();
        f2.horas = sc.nextInt();

        double total = f1.total() + f2.total();
        System.out.printf(  "O total do valor com as horas dos Funcionários "+ f1.nome + " e "+ f2.nome + " foi de " + "%.2f%n", total);
        sc.close();
    }
    
}
