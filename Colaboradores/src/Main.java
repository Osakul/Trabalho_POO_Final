import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaAgencia sistema = new SistemaAgencia();
            //Usuarios de testes
        Gerente gerente = new Gerente(1, "Ana Silva", "gerente", "123");
        AgenteDeViagem agente = new AgenteDeViagem(2, "Bruno Costa", "agente", "456");
        
        sistema.adicionarColaborador(gerente);
        sistema.adicionarColaborador(agente);
        
        System.out.println("--- BEM-VINDO AO SISTEMA DA AGÊNCIA ---");

        // login principal do sistema
        while (true) {
            System.out.print("Login: ");
            String login = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();
                //Tenta autenticação
            Colaborador usuarioLogado = sistema.autenticar(login, senha);

            if (usuarioLogado != null) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + usuarioLogado.getNome());
                
                //Polimorfismo , para nao importar se é Gerente ou Agente o java executa igual 
                usuarioLogado.exibirDashboard(); 
                
                System.out.println("Logout realizado.");

            } else {
                System.out.println("Login ou senha incorretos. Tente novamente.");
            }
            
            System.out.println("-------------------------------------");
        }
    }
}