//Denovo extende a classe Colaboradores par a Classe gerente

public class Gerente extends Colaborador {

    public Gerente (int id , String nome, String login ,String senha ){  
          super (id,nome,login,senha);}
        
//Dashboard
@Override 
public void exibirDashboard(){
    System.out.println("--- Dashboard [Gerente: " + this.nome + "] ---");
        System.out.println("1. Cadastrar Colaborador");
        System.out.println("2. Editar Colaborador");
        System.out.println("3. Excluir Colaborador");
        System.out.println("4. Ver Relatórios de Vendas"); // O Gerente pode ver tudo
        System.out.println("5. Sair (Logout)");
}
}
