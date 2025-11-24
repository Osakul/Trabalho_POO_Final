// Esse codigo é basicamete o cerebro da operação vai conectar todos as classes

import java.util.ArrayList;
import java.util.List;

public class SistemaAgencia {

    // Lista que armazenará TODOS os colaboradores (Gerentes, Agentes, etc.)
    // Graças à herança, todos podem ser guardados na mesma lista de "Colaborador
    private List<Colaborador> listaColaboradores;

    public SistemaAgencia() {
        this.listaColaboradores = new ArrayList<>();
    }

        // Metodo de Login
    public Colaborador autenticar(String login, String senha) {
        
        for (Colaborador c : listaColaboradores) {
           
            if (c.getLogin().equals(login) && c.autenticar(senha)) {
                return c; 
            }
        }
        return null;
    }


    public void adicionarColaborador(Colaborador novoColaborador) {
        this.listaColaboradores.add(novoColaborador);
        System.out.println("Colaborador " + novoColaborador.getNome() + " cadastrado!");
    }
    
    public Colaborador buscarColaborador(int id) {
        for (Colaborador c : listaColaboradores) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public Colaborador buscarColaborador(String nome){
        for(Colaborador c : listaColaboradores){
            if(c.getNome().equalsIgnoreCase(nome)){
                return c;
            }
        }
        return null;    
    }
    
    public void excluirColaborador(int id) {
        Colaborador c = buscarColaborador(id);
        if (c != null) {
            this.listaColaboradores.remove(c);
            System.out.println(c.getNome() + " removido.");
        } else {
            System.out.println("Colaborador não encontrado.");
        }
    }
    

}