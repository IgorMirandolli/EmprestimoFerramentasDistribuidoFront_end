package modelo;

import java.io.Serializable;

public class Ferramenta implements Serializable {
    private static final long serialVersionUID = 1L;

    // Field names must match server-side model for Java serialization
    private int IdFerramentas;
    private String NomeFerramentas;
    private String MarcaFerramentas;
    private double CustoFerramentas;

    public Ferramenta() {
        this(0, "", "", 0.0);
    }

    public Ferramenta(int IdFerramentas, String NomeFerramentas, String MarcaFerramentas, double CustoFerramentas) {
        this.IdFerramentas = IdFerramentas;
        this.NomeFerramentas = NomeFerramentas;
        this.MarcaFerramentas = MarcaFerramentas;
        this.CustoFerramentas = CustoFerramentas;
    }

    public int getIdFerramentas() {
        return IdFerramentas;
    }

    public void setIdFerramentas(int IdFerramentas) {
        this.IdFerramentas = IdFerramentas;
    }

    public String getNomeFerramentas() {
        return NomeFerramentas;
    }

    public void setNomeFerramentas(String NomeFerramentas) {
        this.NomeFerramentas = NomeFerramentas;
    }

    public String getMarcaFerramentas() {
        return MarcaFerramentas;
    }

    public void setMarcaFerramentas(String MarcaFerramentas) {
        this.MarcaFerramentas = MarcaFerramentas;
    }

    public double getCustoFerramentas() {
        return CustoFerramentas;
    }

    public void setCustoFerramenta(double CustoFerramentas) {
        this.CustoFerramentas = CustoFerramentas;
    }
}