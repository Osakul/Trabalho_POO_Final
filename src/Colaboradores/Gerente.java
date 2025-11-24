package colaboradores;
import javax.swing.JOptionPane;

//Denovo extende a classe Colaboradores par a Classe gerente

public class Gerente extends Colaborador {

    public Gerente (int id , String nome, String login ,String senha ){  
          super (id,nome,login,senha);}
        
//Dashboard
@Override 
public void exibirDashboard(){
        JOptionPane.showMessageDialog(null, "--- Dashboard [Gerente: " + this.getNome() + "] ---");
        JOptionPane.showMessageDialog(null, "1. Cadastrar Colaborador");
        JOptionPane.showMessageDialog(null, "2. Editar Colaborador");
        JOptionPane.showMessageDialog(null, "3. Excluir Colaborador");    
        JOptionPane.showMessageDialog(null, "4. Ver Relatórios de Vendas");
        JOptionPane.showMessageDialog( null, "5. Sair (Logout)");


        System.out.println("--- Dashboard [Gerente: " + this.getNome() + "] ---");
        System.out.println("1. Cadastrar Colaborador");
        System.out.println("2. Editar Colaborador");
        System.out.println("3. Excluir Colaborador");
        System.out.println("4. Ver Relatórios de Vendas"); // O Gerente pode ver tudo
        System.out.println("5. Sair (Logout)");
}
}
