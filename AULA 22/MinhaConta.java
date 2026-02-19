// Como usar:
class MinhaConta {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria(100.0);

        // Não podemos fazer isso, pois 'saldo' é privado! O código nem compila.
        // minhaConta.saldo = -500.0; // X ACESSO DIRETO BLOQUEADO!

        // Usamos os métodos públicos (as "portas") para interagir com o objeto:
        minhaConta.depositar(50.0); // ok
        minhaConta.sacar(30.0);    // ok
        minhaConta.sacar(200.0);   // Saldo insuficiente, a regra protegeu a conta!

        System.out.println("Saldo final: " + minhaConta.getSaldo()); // Apenas consulta
    }
}
