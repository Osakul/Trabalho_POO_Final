


// Utilizo metodo abstract para que nao haja outro coaborador

public abstract class Colaborador {
   //Tipo Protected para que as classes-Filhas acessem diretamnete
    protected int id ;
    protected String nome ;
    protected String login ;
    protected String senha;
    //Inicializador de dados
    public Colaborador (int id , String nome, String login , String senha){
    this.id =id;
    this.nome = nome;
    this.login = login;
    this.senha= senha;
        //Metodos  getters para acessar os dados
    }
    public int getId(){
        return id;
    }
    public String getNome (){
        return nome ;
    }

    public String getLogin (){
        return login;
    }

   // Checar Senhas
    public boolean checarSenha(String senhaInput){
        return this.senha.equals(senhaInput);
    }
    //Metodos setters para edição
    public void setNome (String nome ){
        this.nome= nome;
    }
public void setSenha(String senha){
    this.senha = senha;
}
// Aqui utiliza-se o polimorfismo para herdar a classe
public abstract void exibirDashboard();

}