public class Somado {
    public static void main(String[] args) {
        int[] lista ={1, 2, 3, 4, 5};
        Somador somador = new Somador(lista);
        System.out.println("Soma: " + somador.calcularSoma());

    }
    
}
