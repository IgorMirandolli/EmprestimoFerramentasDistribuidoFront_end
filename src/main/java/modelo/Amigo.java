package modelo;

import java.io.Serializable;

public class Amigo implements Serializable {
    private static final long serialVersionUID = 1L;

    // Field names must match server-side model for Java serialization
    private String NomeAmigo;
    private int IdAmigo;
    private String EmailAmigo;
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

    public String getNomeAmigo() {
        return NomeAmigo;
    }

    public void setNomeAmigo(String NomeAmigo) {
        this.NomeAmigo = NomeAmigo;
    }

    public int getIdAmigo() {
        return IdAmigo;
    }

    public void setIdAmigo(int IdAmigo) {
        this.IdAmigo = IdAmigo;
    }

    public String getEmailAmigo() {
        return EmailAmigo;
    }

    public void setEmailAmigo(String EmailAmigo) {
        this.EmailAmigo = EmailAmigo;
    }

    public String getTelefoneAmigo() {
        return TelefoneAmigo;
    }

    public void setTelefoneAmigo(String TelefoneAmigo) {
        this.TelefoneAmigo = TelefoneAmigo;
    }
}