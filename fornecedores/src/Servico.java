public class Servico {
    private String nome;
    private boolean ativo;

    public Servico(String nome) {
        this.nome = nome;
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void desativar() {
        ativo = false;
    }
}