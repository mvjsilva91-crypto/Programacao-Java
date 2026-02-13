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

        sc.close();
    }
    
}
