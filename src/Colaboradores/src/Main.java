package colaboradores;
import javax.swing.JOptionPane;

public class Main {
    public static void iniciarSistema(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        SistemaAgencia sistema = new SistemaAgencia();
            //Usuarios de testes
        Gerente gerente = new Gerente(1, "Ana Silva", "gerente", "123");
        AgenteDeViagem agente = new AgenteDeViagem(2, "Bruno Costa", "agente", "456");
        
        sistema.adicionarColaborador(gerente);
        sistema.adicionarColaborador(agente);
        
        System.out.println("--- BEM-VINDO AO SISTEMA DA AGÊNCIA ---");

        // login principal do sistema
        while (true) {
            String[] opcoes = {"Login", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Bem-vindo ao Sistema da Agência",
                    "Login", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            if (escolha == 1 || escolha == -1) break; // Sai se escolher "Sair" ou fechar a janela

            String login = JOptionPane.showInputDialog("Digite seu Login:");
            if (login == null) continue; // Se cancelar, volta pro menu

            String senha = JOptionPane.showInputDialog("Digite sua Senha:");
            if (senha == null) continue;

            Colaborador usuarioLogado = sistema.autenticar(login, senha);

            if (usuarioLogado != null) {
                JOptionPane.showMessageDialog(null, "Bem-vindo, " + usuarioLogado.getNome());
                // Aqui chamamos o dashboard. 
                // NOTA: Você precisará adaptar o 'exibirDashboard' dentro de Gerente/Agente 
                // para usar janelas também, ou ele vai imprimir no console.
                usuarioLogado.exibirDashboard(); 
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}