import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SistemaFornecedores {

    private List<Fornecedor> lista = new ArrayList<>();
    private List<List<Servico>> servicosFornecedor = new ArrayList<>();

    // CADASTRAR
    public void cadastrarFornecedor() {
        String nome = JOptionPane.showInputDialog("Nome do fornecedor:");
        String[] opcoes = {"Transporte", "Hospedagem"};
        String tipo = (String) JOptionPane.showInputDialog(null, "Tipo:",
                "Escolha", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        Fornecedor f;

        if (tipo.equals("Transporte")) {
            f = new FornecedorTransporte(nome);
        } else {
            f = new FornecedorHospedagem(nome);
        }

        lista.add(f);
        servicosFornecedor.add(new ArrayList<>());

        JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!");
    }

    // EDITAR
    public void editarFornecedor() {
        Fornecedor f = buscarFornecedorPorNome();

        if (f == null) return;

        String novoNome = JOptionPane.showInputDialog("Novo nome:", f.getNome());
        f.setNome(novoNome);

        JOptionPane.showMessageDialog(null, "Fornecedor atualizado!");
    }

    // EXCLUIR
    public void excluirFornecedor() {
        Fornecedor f = buscarFornecedorPorNome();

        if (f == null) return;

        int index = lista.indexOf(f);
        List<Servico> servicos = servicosFornecedor.get(index);

        boolean temServicoAtivo = servicos.stream().anyMatch(Servico::isAtivo);

        if (temServicoAtivo) {
            JOptionPane.showMessageDialog(null,
                "Não é possível excluir! Existem serviços ATIVOS vinculados.");
            return;
        }

        lista.remove(index);
        servicosFornecedor.remove(index);

        JOptionPane.showMessageDialog(null, "Fornecedor excluído!");
    }

    // CONSULTAR
    public void consultarFornecedor() {
        String filtro = JOptionPane.showInputDialog(
            "Digite parte do nome ou tipo para buscar:"
        ).toLowerCase();

        StringBuilder sb = new StringBuilder("Resultados:\n");

        for (Fornecedor f : lista) {
            if (f.getNome().toLowerCase().contains(filtro) ||
                f.getTipo().toLowerCase().contains(filtro)) {
                sb.append(f.getDescricao()).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // ASSOCIAR SERVIÇO
    public void associarServico() {
        Fornecedor f = buscarFornecedorPorNome();

        if (f == null) return;

        int index = lista.indexOf(f);
        String nomeServico = JOptionPane.showInputDialog("Nome do serviço:");
        servicosFornecedor.get(index).add(new Servico(nomeServico));

        JOptionPane.showMessageDialog(null, "Serviço associado!");
    }

    // MÉTODO AUXILIAR
    private Fornecedor buscarFornecedorPorNome() {
        String nome = JOptionPane.showInputDialog("Digite o nome do fornecedor:");
        for (Fornecedor f : lista) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        JOptionPane.showMessageDialog(null, "Fornecedor não encontrado!");
        return null;
    }

}