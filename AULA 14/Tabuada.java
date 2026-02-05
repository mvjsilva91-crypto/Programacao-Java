import java.util.Scanner;
public class Tabuada {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;

    System.out.println("Bem Vindo a Tabuada Interativa!");
    System.out.print("Digite um Número para ver a tabuada (Ou 0 para Sair)");
    numero = s.nextInt();
    while (numero !=0) {
        System.out.println("Tabuada do " + numero + " :");
    
        int i = 1;
        while (i <= 10) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
        i ++;
        }
        System.out.print("Digite outro número ou 0 para Sair");
        numero = s.nextInt();

    }
     System.out.println("Programa Encerrado! Até a proxima!!!");
     s.close();
    
   }

}
