public class FornecedorHospedagem extends Fornecedor {

    public FornecedorHospedagem(String nome) {
        super(nome, "Hospedagem");
    }

    @Override
    public String getDescricao() {
        return "Fornecedor de Hospedagem: " + nome;
    }
}