public abstract class Cliente {

    String nome;
    String email;
    String telefone;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public abstract void exibirDados();
}
