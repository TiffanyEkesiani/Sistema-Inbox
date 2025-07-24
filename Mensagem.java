package ProjetosParalelos.sistemainbox;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Mensagem {
    private String remetente;
    private LocalDateTime dataHora; // Guarda data e hora da mensagem

    // Esta classe é abstract porque:
    // - Representa uma mensagem genérica, não faz sentido criar objeto direto dela.
    // - Possui métodos abstratos que obrigam as subclasses a implementá-los.
    // Nem toda superclasse precisa ser abstract, só quando é incompleta ou tem métodos abstratos.

    public Mensagem(String remetente) {
        this.remetente = remetente;
        this.dataHora = LocalDateTime.now();
    }

    public String getRemetente() {
        return remetente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public abstract String getResumo();

    public abstract String getConteudoFormatado();

    protected String formatarData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return dataHora.format(formatter);
    }
}
