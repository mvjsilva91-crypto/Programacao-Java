import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double n4 = sc.nextDouble();

        sc.nextLine(); // Limpa o buffer antes de ler o sexo

        System.out.print("Digite o sexo do aluno (M/F): ");
        String sexoInput = sc.nextLine();
        
        String sexo;
        if (sexoInput.equalsIgnoreCase("M")) {
            sexo = "Masculino";
        } else if (sexoInput.equalsIgnoreCase("F")) {
            sexo = "Feminino";
        } else {
            sexo = "Sexo não informado!";
        }

        double media = (n1 + n2 + n3 + n4) / 4;

       
        if (media >= 6) {
            System.out.println("Caro aluno, seu resultado é: Aprovado");
        } else {
            System.out.println("Caro aluno, seu resultado é: Reprovado");
        }

        if (media >= 6) {
            System.out.println("Cara aluna, seu resultado é: Aprovado");
        } else {
            System.out.println("Cara aluna, seu resultado é: Reprovado");
        }

        System.out.println("A média é: " + media);
        System.out.println("O sexo do aluno é: " + sexo);

        sc.close();
    }
}


