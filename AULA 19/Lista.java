import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3]; /*DECLARAÇÃO DE VETOR*/
        
        for(int i = 0; i < 3; i++){
            System.out.print("\n digite o nome " + (i +1) + "");
            nomes[i] = sc.nextLine();/*Armazenado o Vetor */

        }

        System.out.println("Lista de Nomes");
        for(int i = 0; i < nomes.length; i++){
            System.out.println((i + 1) + ":" + nomes[i]);/*Exibindo o conteúdo do vetor */

        }
         sc.close();
    }
       
}
