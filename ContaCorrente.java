public class ContaCorrente extends Conta {

    public ContaCorrente(int numeroConta, String agencia, double saldo, PessoaFisica cliente) {
        super(numeroConta, agencia, saldo, cliente);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente! Saldo atual: R$ " + saldo);
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + saldo);
        }
    }
}
