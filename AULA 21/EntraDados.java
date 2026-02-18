import java.util.Scanner;
import java.util.concurrent.FutureTask;

public class EntraDados {
    private Scanner scanner;

    public EntraDados() {
        scanner = new Scanner(System.in);
    }

    public Fruta lerFrutas() {
    System.out.println("Digite o nome da Fruta: ");
    String nome = scanner.nextLine();

    System.out.println("Digite a Quantidade em estoque de " + nome + ":");
    int quantidade = scanner.nextInt();
    scanner.nextLine();

    return new Fruta(nome, quantidade);

    }

    public void fecharScanner() {
        scanner.close();
    }
    
}
