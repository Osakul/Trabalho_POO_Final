/**
 * A classe Atendente representa um colaborador com funções
 * de atendimento e consulta.
 * * Ela herda todos os atributos e métodos básicos de Colaborador
 * e implementa seu próprio dashboard.
 */
public class Atendente extends Colaborador {

    /**
     * Construtor da classe Atendente.
     * * @param id    O ID do atendente.
     * @param nome  O nome do atendente.
     * @param login O login de acesso ao sistema.
     * @param senha A senha de acesso ao sistema.
     */
    public Atendente(int id, String nome, String login, String senha) {
        // A palavra 'super' chama o construtor da classe-mãe (Colaborador)
        // para inicializar os atributos que são comuns a todos.
        super(id, nome, login, senha);
    }

    /**
     * Implementação obrigatória do método abstrato da classe-mãe.
     * Define o menu (dashboard) específico para o Atendente.
     * * Conceito: Polimorfismo e Sobrescrita (@Override)
     */
    @Override
    public void exibirDashboard() {
        System.out.println("--- Dashboard [Atendente: " + this.nome + "] ---");
        System.out.println("1. Consultar Pacotes de Viagem");
        System.out.println("2. Verificar Reservas de Cliente");
        System.out.println("3. Registrar Novo Cliente");
        System.out.println("4. Sair (Logout)");
        
        // Assim como nas outras classes, aqui você adicionaria a lógica
        // de um Scanner e switch-case para fazer o menu funcionar.
    }
}