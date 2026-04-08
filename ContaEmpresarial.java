public class ContaEmpresarial extends ContaEspecial {

    public ContaEmpresarial(int numeroConta, String agencia, double saldo, PessoaJuridica cliente, double chequeEspecial) {
        super(numeroConta, agencia, saldo, (PessoaFisica) null, chequeEspecial);
        this.cliente = cliente;
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
}
