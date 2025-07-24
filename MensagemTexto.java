package ProjetosParalelos.sistemainbox;

// Subclasse concreta que representa uma mensagem de texto
public class MensagemTexto extends Mensagem {
    private String conteudo;

    public MensagemTexto(String remetente, String conteudo) {
        super(remetente); // chama o construtor da superclasse
        this.conteudo = conteudo;
    }

    // Mostra um resumo com remetente e data formatada
    @Override
    public String getResumo() {
        return "De: " + getRemetente() + " | Data: " + formatarData();
    }

    // Mostra o conteúdo da mensagem completo
    @Override
    public String getConteudoFormatado() {
        return "Mensagem de texto:\n" + conteudo;
    }
}
