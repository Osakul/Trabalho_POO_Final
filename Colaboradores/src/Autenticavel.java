public interface Autenticavel {
    // Este é o método abstrato que define o "contrato"
    // Quem implementar essa interface OBRIGATORIAMENTE terá que ter este método
    boolean autenticar(String senha);
}