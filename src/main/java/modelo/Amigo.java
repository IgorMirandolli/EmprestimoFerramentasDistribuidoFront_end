package modelo;

import java.io.Serializable;

public class Amigo implements Serializable {
    private static final long serialVersionUID = 1L;

    // Atributos
    /** Nome completo do amigo. */
    private String NomeAmigo;
    /** Identificador único do amigo no sistema. */
    private int IdAmigo;
    /** E-mail de contato do amigo. */
    private String EmailAmigo;
    /** Número de telefone do amigo. */
    private String TelefoneAmigo;

    public Amigo() {
        this(0, "", "", "");
    }

    public Amigo(int IdAmigo, String NomeAmigo, String TelefoneAmigo, String EmailAmigo) {
        this.IdAmigo = IdAmigo;
        this.NomeAmigo = NomeAmigo;
        this.TelefoneAmigo = TelefoneAmigo;
        this.EmailAmigo = EmailAmigo;
    }

     /* Retorna o nome do amigo. */
    public String getNomeAmigo() {
        return NomeAmigo;
    }

    /* Define o nome do amigo. */
    public void setNomeAmigo(String NomeAmigo) {
        this.NomeAmigo = NomeAmigo;
    }

    /* Retorna o identificador único do amigo. */
    public int getIdAmigo() {
        return IdAmigo;
    }

    /* Define o identificador único do amigo. */
    public void setIdAmigo(int IdAmigo) {
        this.IdAmigo = IdAmigo;
    }

    /* Retorna o e-mail do amigo. */
    public String getEmailAmigo() {
        return EmailAmigo;
    }

    /* Define o e-mail do amigo. */
    public void setEmailAmigo(String EmailAmigo) {
        this.EmailAmigo = EmailAmigo;
    }

    /* Retorna o número de telefone do amigo. */
    public String getTelefoneAmigo() {
        return TelefoneAmigo;
    }

    /* Define o número de telefone do amigo. */
    public void setTelefoneAmigo(String TelefoneAmigo) {
        this.TelefoneAmigo = TelefoneAmigo;
    }
}