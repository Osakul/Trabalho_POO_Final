package fornecedores;

import javax.swing.JOptionPane;

public class Main {
    public static void iniciarSistema() {
        SistemaFornecedores sistema = new SistemaFornecedores();

        String menu = """
                1 - Cadastrar Fornecedor
                2 - Editar Fornecedor
                3 - Excluir Fornecedor
                4 - Consultar Fornecedores
                5 - Associar Serviço
                0 - Sair
                """;

        int opc;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opc) {
                case 1 -> sistema.cadastrarFornecedor();
                case 2 -> sistema.editarFornecedor();
                case 3 -> sistema.excluirFornecedor();
                case 4 -> sistema.consultarFornecedor();
                case 5 -> sistema.associarServico();
                case 0 -> JOptionPane.showMessageDialog(null, "Saindo...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opc != 0);
    }
}