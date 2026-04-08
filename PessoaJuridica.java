public class PessoaJuridica extends Cliente {

    String cnpj;

    public PessoaJuridica(String nome, String email, String telefone, String cnpj) {
        super(nome, email, telefone);
        this.cnpj = cnpj;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Cliente Pessoa Jurídica ===");
        System.out.println("Empresa: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }
}
