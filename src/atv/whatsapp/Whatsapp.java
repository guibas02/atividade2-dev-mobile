package atv.whatsapp;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp{

    private List<Contato> contatos;
    private List<Mensagem> mensagens;

    public Whatsapp(){
        this.contatos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public void listarContatos() {
        System.out.println("Lista de Contatos:");
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + ", Celular: " + contato.getCelular());
        }
    }

    public void listarMensagens() {
        System.out.println("Lista de Mensagens:");
        for (Mensagem mensagem : mensagens) {
            System.out.println("Destinatário: " + mensagem.getDestinatario().getNome() +
                    ", Hora de Envio: " + mensagem.getHoraEnvio() +
                    ", Conteúdo: " + mensagem.getConteudo());
        }
    }
}
