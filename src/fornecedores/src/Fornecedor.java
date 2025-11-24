import java.util.ArrayList;
import java.util.List;
package fornecedores;

public abstract class Fornecedor {
    protected String nome;
    protected String tipo; // Transporte, Hospedagem, etc.
    private List<Servico> servicos;

    public Fornecedor(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.servicos = new ArrayList<>();
    }

    public void adicionarServico(Servico s){
        this.servicos.add(s);
    }

    public List<Servico> getServicos(){
        return servicos;
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