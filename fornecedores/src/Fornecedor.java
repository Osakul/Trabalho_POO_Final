public abstract class Fornecedor {
    protected String nome;
    protected String tipo; // Transporte, Hospedagem, etc.

    public Fornecedor(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Polimorfismo: cada fornecedor descreve-se de forma personalizada
    public abstract String getDescricao();
}