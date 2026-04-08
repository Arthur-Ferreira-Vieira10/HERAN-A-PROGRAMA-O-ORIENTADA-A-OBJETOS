public class ContaEspecial extends Conta {

    double chequeEspecial;

    public ContaEspecial(int numeroConta, String agencia, double saldo, PessoaFisica cliente, double chequeEspecial) {
        super(numeroConta, agencia, saldo, cliente);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else if (valor > saldo + chequeEspecial) {
            System.out.println("Limite insuficiente! Limite disponível: R$ " + (saldo + chequeEspecial));
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + saldo);
        }
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cheque Especial: R$ " + chequeEspecial);
        System.out.println("Limite total disponível: R$ " + (saldo + chequeEspecial));
        System.out.println("======================");
    }
}
