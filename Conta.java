public abstract class Conta {

    int numeroConta;
    String agencia;
    double saldo;
    Cliente cliente;

    public Conta(int numeroConta, String agencia, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public abstract void sacar(double valor);

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido!");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + saldo);
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        double saldoAntes = saldo;
        sacar(valor);
       
        if (saldo < saldoAntes) {
            contaDestino.saldo += valor;
            System.out.println("Transferência de R$ " + valor + " realizada!");
            System.out.println("Saldo da conta " + contaDestino.numeroConta + ": R$ " + contaDestino.saldo);
        }
    }

    public void exibirDados() {
        System.out.println("=== Dados da Conta ===");
        cliente.exibirDados();
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("======================");
    }
}
