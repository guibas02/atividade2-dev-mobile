package atv.whatsapp;

public abstract class Mensagem {
    private Contato destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem(Contato destinatario, String horaEnvio, String conteudo){
        this.destinatario = destinatario;
        this.conteudo = conteudo;
        this.horaEnvio = horaEnvio;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(String novoEnvio) {
        this.horaEnvio = novoEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Contato getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Contato destinatario) {
        this.destinatario = destinatario;
    }
}
