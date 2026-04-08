public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroConta, String agencia, double saldo, PessoaFisica cliente) {
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

    public void rendimento() {
        double rendimento = saldo * 0.005;
        saldo += rendimento;
        System.out.println("Rendimento de 0,5% aplicado: R$ " + rendimento);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
