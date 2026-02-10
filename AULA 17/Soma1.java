import java.util.Scanner;

public class Soma1 {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        double valor; 
        double soma = 0;
        do{
            System.out.print("Digite um Valor para a soma: ");
            valor = sm.nextDouble();
            
            if (valor == 0){
                System.out.printf("Número Inválido!");
                break;

            }
            soma += valor;
            System.out.println("Total: " + soma);
       
        }while (valor != 0);

    }
    
}
