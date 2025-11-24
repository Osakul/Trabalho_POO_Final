package fornecedores;

public class FornecedorTransporte extends Fornecedor {

    public FornecedorTransporte(String nome) {
        super(nome, "Transporte");
    }

    @Override
    public String getDescricao() {
        return "Fornecedor de Transporte: " + nome;
    }
}