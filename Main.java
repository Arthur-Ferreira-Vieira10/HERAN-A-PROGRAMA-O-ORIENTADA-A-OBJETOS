public class Main {
    public static void main(String[] args) {

        PessoaFisica pf1 = new PessoaFisica("João Silva", "joao@email.com", "64999990001", "123.456.789-00");
        PessoaFisica pf2 = new PessoaFisica("Maria Souza", "maria@email.com", "64999990002", "987.654.321-00");
        PessoaJuridica pj1 = new PessoaJuridica("Empresa XYZ", "contato@xyz.com", "6433330001", "12.345.678/0001-99");

        ContaCorrente cc = new ContaCorrente(1001, "0001", 1000.0, pf1);
        ContaEspecial ce = new ContaEspecial(1002, "0001", 1000.0, pf2, 2000.0);
        ContaPoupanca cp = new ContaPoupanca(1003, "0001", 2000.0, pf1);
        ContaEmpresarial emp = new ContaEmpresarial(1004, "0001", 5000.0, pj1, 10000.0);

        System.out.println("\n===== CONTA CORRENTE =====");
        cc.exibirDados();
        cc.depositar(500.0);
        cc.sacar(200.0);
        cc.sacar(9999.0);

        System.out.println("\n===== CONTA ESPECIAL =====");
        ce.exibirDados();
        ce.sacar(3000.0);
        ce.sacar(1.0);

        System.out.println("\n===== CONTA POUPANÇA =====");
        cp.exibirDados();
        cp.depositar(1000.0);
        cp.rendimento();

        System.out.println("\n===== CONTA EMPRESARIAL =====");
        emp.exibirDados();
        emp.sacar(3000.0);
        emp.depositar(1000.0);

        System.out.println("\n===== TRANSFERÊNCIA =====");
        System.out.println("Transferindo R$200 da Conta Corrente para Conta Poupança:");
        cc.transferir(200.0, cp);
    }
}
