import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = s.nextLine();

        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = s.nextDouble();
            soma += notas[i];
        }

        double media = soma / 4;

        if (media >= 7) {
            System.out.println(nome + " sua média final é: " + media + " e você está aprovado!!!");
        } else {
            System.out.println(nome + " sua média final é: " + media + " e você está REPROVADO!!!");
        }

        s.close();
    }
}
