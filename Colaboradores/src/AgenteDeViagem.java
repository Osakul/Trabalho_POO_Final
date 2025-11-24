


//classe extendida da classe "Colaboradores"
public class AgenteDeViagem extends Colaborador {
   // Atributos específicos do Agente de Viagem
   
    private double totalVendas = 0;

    private static final double PERCENTUAL_COMISSAO = 0.05;
    // O construtor do filho CHAMA o construtor da mãe
    public AgenteDeViagem(int id , String nome ,String login, String senha){
        super (id, nome, login, senha);
    }
        // Aqui sao outros metodos especificos da classe
    public void registrarVenda (double valorVenda){
        this.totalVendas += valorVenda;
        System.out.println("Venda de R$ "+ valorVenda + "registrada para " +this.nome);
    }
        public double calcularComissao (){
            double comissao = this.totalVendas * PERCENTUAL_COMISSAO;
            return comissao;
        }
        // @Override indica que estamos "substituindo" o método abstrato da classe-mãe
        @Override
        public void exibirDashboard(){
            System.out.println("--- Dashboard [Agente: " + this.nome + "] ---");
        System.out.println("1. Registrar Venda");
        System.out.println("2. Calcular Minha Comissão");
        System.out.println("3. Sair (Logout)");
        }

}

