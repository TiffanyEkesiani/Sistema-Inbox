package ProjetosParalelos.sistemainbox;

// Classe principal para testar o funcionamento das mensagens
public class Main {
    public static void main(String[] args) {
        // Cria uma instância da subclasse MensagemTexto
        MensagemTexto mensagem1 = new MensagemTexto("Tiffany", "Eaiii, bora beber sexta?");

        // Exibe o resumo da mensagem (remetente + data)
        System.out.println(mensagem1.getResumo());

        // Exibe o conteúdo completo da mensagem
        System.out.println(mensagem1.getConteudoFormatado());
    }
}
