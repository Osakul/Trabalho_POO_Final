import javax.swing.JOptionPane;

public class SistemaCompleto {
    public static void main(String[] args) {
        String[] modulos = {"Módulo Agência (Login)", "Módulo Fornecedores", "Sair"};
        
        while(true) {
            int escolha = JOptionPane.showOptionDialog(null, "Selecione o Módulo:",
                    "Sistema de Gestão de Turismo", JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, modulos, modulos[0]);

            if (escolha == 0) {
                // Chama o main da Agência. 
                // Obs: Precisa ajustar o Main da agência para não ter 'public static void main'
                // e sim um método 'iniciar()', senão pode dar conflito de execução.
                colaboradores.Main.iniciarSistema(); 
            } else if (escolha == 1) {
                // Chama o sistema de fornecedores
                fornecedores.Main.iniciarSistema();
            } else {
                break;
            }
        }
    }
}